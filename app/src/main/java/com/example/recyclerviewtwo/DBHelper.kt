package com.example.recyclerviewtwo

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DBHelper (context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private val DATABASE_NAME = "THING_DATABASE"
        private val DATABASE_VERSION = 1
        val TABLE_NAME = "thing_table"
        val KEY_NAME = "name"
        val KEY_DESCRIPTION = "description"
        val KEY_IMAGE = "image"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val THING_TABLE = ("CREATE TABLE " + TABLE_NAME + " (" +
                KEY_NAME + " TEXT PRIMARY KEY, " +
                KEY_DESCRIPTION + " TEXT," +
                KEY_IMAGE + " INTEGER" + ")")
        db.execSQL(THING_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    fun addThing(thing: Thing) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, thing.name)
        contentValues.put(KEY_DESCRIPTION, thing.description)
        contentValues.put(KEY_IMAGE, thing.image)
        db.insert(TABLE_NAME, null, contentValues)
        db.close()
    }

    @SuppressLint("Range", "Recycle")
    fun readThing(): MutableList<Thing> {
        val thingList: MutableList<Thing> = mutableListOf()
        val selectQuery = "SELECT * FROM $TABLE_NAME"
        val db = this.readableDatabase
        var cursor: Cursor? = null
        try {
            cursor = db.rawQuery(selectQuery, null)
        } catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return thingList
        }
        var thingName: String
        var thingDescription: String
        var thingImage:Int
        if (cursor.moveToFirst()) {
            do {
                thingName = cursor.getString(cursor.getColumnIndex("name"))
                thingDescription = cursor.getString(cursor.getColumnIndex("description"))
                thingImage = cursor.getInt(cursor.getColumnIndex("image"))
                val thing = Thing(thingName, thingDescription, thingImage)
                thingList.add(thing)
            } while (cursor.moveToNext())
        }
        return thingList
    }

    fun updateThing(thing: Thing) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, thing.name)
        contentValues.put(KEY_DESCRIPTION, thing.description)
        contentValues.put(KEY_IMAGE, thing.image)
        db.update(TABLE_NAME, contentValues, "name=?", arrayOf(thing.name))
        db.close()
    }

    fun deleteThing(thing: Thing) {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_NAME, thing.name)
        db.delete(TABLE_NAME, "name=?", arrayOf(thing.name))
        db.close()
    }
}