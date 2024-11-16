package com.example.recyclerviewtwo

class ThingDataBase {
    companion object {
        val things = mutableListOf(
            Thing(
                "Трикотажное платье миди с разрезом",
                "Полупрозрачный трикотаж из вискозы\n" +
                        "Приталенный крой\n" +
                        "Длина миди\n" +
                        "Подол с разрезом сбоку\n" +
                        "Цвет: черный",
                R.drawable.dressblack
            ),
            Thing(
                "Сапоги из натуральной кожи",
                "Верх: 100% натуральная кожа\n" +
                        "Внутренняя отделка: 100% натуральная кожа\n" +
                        "Стелька: 100% натуральная кожа\n" +
                        "Широкое голенище\n" +
                        "Прямоугольный мыс\n" +
                        "Скошенный каблук\n" +
                        "Цвет: черный",
                R.drawable.sapogi
            ),
            Thing(
                "Сумка из натуральной кожи",
                "100% натуральная кожа с ворсом\n" +
                        "Геометричная форма\n" +
                        "Плечевой регулируемый ремень\n" +
                        "Одно основное отделение\n" +
                        "Застежка на молнию\n" +
                        "Цвет: черный с леопардовым принтом",
                R.drawable.sumka
            ),
            Thing(
                "Объемный браслет",
                "Объемный браслет жесткой формы\n" +
                        "Металл золотистого цвета",
                R.drawable.braslet
            ),
            Thing(
                "Джемпер",
                "Машинная стирка запрещена, Ручная стирка при максимальной температуре 40ºС, " +
                        "Не отбеливать, Машинная сушка запрещена, Глажение при 110ºС, Профессиональная сухая чистка. " +
                        "Мягкий режим., Расправить и сушить на плоскости, Стирать и утюжить вывернутым наизнанку",
                R.drawable.djemper
            ),
            Thing(
                "Трикотажная юбка-карандаш с разрезом",
                "Трикотаж из вискозы\n" +
                        "Фактурная вязка в рубчик\n" +
                        "Облегающий крой\n" +
                        "Длина миди\n" +
                        "Средняя посадка\n" +
                        "Эластичный пояс\n" +
                        "Подол с разрезом сзади",
                R.drawable.ubka
            ),
            Thing(
                "Объемные серьги со стразами",
                "\"Мятый\" металл золотистого цвета\n" +
                        "Инкрустация стразами",
                R.drawable.sergi
            ),
            Thing(
                "Ботильоны из натуральной кожи",
                "100% натуральная кожа\n" +
                        "Заостренный мыс\n" +
                        "Наборный устойчивый каблук\n" +
                        "Застежка на скрытую молнию",
                R.drawable.batilion
            ),
            Thing(
                "Джинсовый топ с бархатным напылением",
                "Джинсовая ткань с бархатным напылением\n" +
                        "Облегающий укороченный крой\n" +
                        "Перестегивающиеся на спинке бретели для регулировки длины\n" +
                        "Застежка сбоку на молнию",
                R.drawable.top
            ),
            Thing(
                "Шуба из искусственного меха",
                "Длинношерстный искусственный мех под мех ламы\n" +
                        "Подклад\n" +
                        "Прямой крой\n" +
                        "Широкий отложной воротник\n" +
                        "Боковые карманы\n" +
                        "Застежка на шубные крючки\n" +
                        "Цвет: сливочный\n" +
                        "Комфортная температура для носки — не ниже -7°C",
                R.drawable.shuba
            ),
            Thing(
                "Многоярусный чокер",
                "Металл золотистого цвета\n" +
                        "Вставки из бусин",
                R.drawable.chocker
            ),
            Thing(
                "Джинсы Straight с бархатным напылением",
                "Джинсовая ткань с бархатным напылением\n" +
                        "Прямой крой\n" +
                        "Средняя посадка\n" +
                        "V-образная кокетка\n" +
                        "Функциональные карманы\n" +
                        "Застежка на молнию и пуговицу\n" +
                        "Цвет: темно-коричневый",
                R.drawable.jins
            ),
            Thing(
                "Ботильоны из натуральной замши",
                "Верх: 100% натуральная замша\n" +
                        "Внутри: 100% натуральная кожа\n" +
                        "Заостренный мыс\n" +
                        "Низкий каблук\n" +
                        "Застежка на скрытую молнию с внутренней стороны",
                R.drawable.batil2
            ),
            Thing(
                "Дубленка-бушлат из искусственной замши",
                "Искусственная замша\n" +
                        "Искусственный мех с шерстью в составе\n" +
                        "Свободный крой\n" +
                        "Спущенная линия плеча\n" +
                        "Рукава \"окорок\"\n" +
                        "Широкий отложной воротник\n" +
                        "Карманы по бокам\n" +
                        "Декоративные паты на рукавах\n" +
                        "Застежка на навесные петли и пуговицы\n" +
                        "Цвет: табачный\n" +
                        "Комфортная температура для носки — не ниже -7°C",
                R.drawable.dublenka
            ),
            Thing(
                "Брюки-палаццо с акцентными швами",
                "Плотная костюмная ткань с добавлением вискозы\n" +
                        "Широкий крой\n" +
                        "Высокая посадка\n" +
                        "Брючины с акцентными швами\n" +
                        "Карманы в боковых швах\n" +
                        "Шлевки для ремня\n" +
                        "Застежка на молнию, пуговицу и крючок",
                R.drawable.bruki
            ),
            Thing(
                "Объемные серьги-кольца",
                "Незамкнутые серьги-кольца\n" +
                        "«Металл золотистого цвета\n" +
                        "Вид замка: гвоздики",
                R.drawable.sergitwo
            ),
            Thing(
                "Полупрозрачная водолазка из шерсти альпаки",
                "Пряжа из шерсти альпаки\n" +
                        "Прилегающий крой\n" +
                        "Воротник-стойка с отворотом\n" +
                        "Длинные рукава\n" +
                        "Три цвета: серый, белый и зеленый",
                R.drawable.vodolazka
            ),
            Thing(
                "Длинный пуховик с капюшоном",
                "Курточная ткань с эффектом кожи\n" +
                        "Геометричная стежка\n" +
                        "Утеплитель\n" +
                        "Прямой крой\n" +
                        "Капюшон\n" +
                        "Воротник-стойка\n" +
                        "Трикотажные манжеты с отверстием для большого пальца\n" +
                        "Функциональные карманы по бокам\n" +
                        "Застежка на молнию и планку с кнопками",
                R.drawable.puchovick
            ),
            Thing(
                "Утепленная джинсовая куртка с искусственным мехом",
                "100% хлопок, искусственный мех\n" +
                        "Прямой крой\n" +
                        "Отложной воротник\n" +
                        "Декоративные карманы на груди\n" +
                        "Функциональные карманы по бокам\n" +
                        "Застежка на пуговицы\n" +
                        "Цвет: голубой\n" +
                        "Комфортная температура для носки — не ниже 0°C",
                R.drawable.kurtka
            ),
            Thing(
                "Джинсы Straight с кристаллами",
                "Деним из хлопка с добавлением вискозы\n" +
                        "Отделка кристаллами\n" +
                        "Прямой крой\n" +
                        "Средняя посадка\n" +
                        "V-образная кокетка\n" +
                        "Функциональные карманы\n" +
                        "Застежка на молнию и пуговицу\n" +
                        "Цвет: голубой индиго",
                R.drawable.jinskrist
            )
        )
    }
}