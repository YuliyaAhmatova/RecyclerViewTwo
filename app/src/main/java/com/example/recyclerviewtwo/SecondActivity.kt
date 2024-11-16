package com.example.recyclerviewtwo

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {

    private var updatedThing: Thing? = null
    private var adapter: CustomAdapter? = null
    private var thingsUpdate: MutableList<Thing>? = null
    private var things: MutableList<Thing> = ThingDataBase.things

    private lateinit var toolbarSA: Toolbar
    private lateinit var recyclerViewRV: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        toolbarSA = findViewById(R.id.toolbarSA)
        recyclerViewRV = findViewById(R.id.recyclerViewRV)

        setSupportActionBar(toolbarSA)
        title = "Мой гардероб"

        recyclerViewRV.layoutManager = LinearLayoutManager(this)
    }

    override fun onResume() {
        super.onResume()
        updatedThing = intent.getSerializableExtra("updatedThing") as Thing?
        if (updatedThing != null) {
            thingsUpdate = intent.getSerializableExtra("list") as MutableList<Thing>
            viewDataAdapter()
        } else {
            thingsUpdate = things
            viewDataAdapter()
        }

        recyclerViewRV.setHasFixedSize(true)
        adapter?.setOnThingClickListener(object :
            CustomAdapter.OnThingClickListener {
            override fun onThingClick(thing: Thing, position: Int) {
                val item = position
                val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                intent.putExtra("thing", thing)
                intent.putExtra("things", thingsUpdate as ArrayList<Thing>)
                intent.putExtra("position", item)
                startActivity(intent)
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun viewDataAdapter() {
        adapter = CustomAdapter(thingsUpdate!!)
        recyclerViewRV.adapter = adapter
        adapter?.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_sa, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.exitSAMenu -> {
                finishAffinity()
                Toast.makeText(applicationContext, "Программа завершена", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}