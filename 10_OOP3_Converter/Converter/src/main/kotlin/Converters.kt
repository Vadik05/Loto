//  Создайте объект-синглтон Converters, который хранит все созданные вами конвертеры валют.
//  Объявите в нём функцию get(currencyCode: String), которая возвращает конвертер,
//  основываясь на переданном currencyCode.

import kotlin.math.roundToInt

object Converters {
    private val currencyList = listOf(EUR(), USD(),GBP())

    fun get(currencyCode: String): CurrencyConverter {
        return currencyList.find { it.currencyCode == currencyCode } ?: object  : CurrencyConverter{
            override var currencyCode: String = "UNK"
            override fun convertToRub(currencyCode: String, currencyRate : Double, rubAmount : Double) {

                println("Неизвестная валюта")
            }

        }
    }




}
