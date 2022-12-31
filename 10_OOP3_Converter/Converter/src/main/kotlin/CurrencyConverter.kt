
//   Создайте интерфейс CurrencyConverter. Он должен описывать:
//поле currencyCode, которое хранит международный код валюты в виде строки;
//функцию convertRub, которая конвертирует рубли в валюту.



interface CurrencyConverter {
    var currencyCode: String
    fun convertToRub(currencyCode: String, currencyRate: Double, rubAmount: Double)
}