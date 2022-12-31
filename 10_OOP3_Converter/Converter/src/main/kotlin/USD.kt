import kotlin.math.roundToInt

class USD:CurrencyConverter {
    override var currencyCode = "USD"
    override fun convertToRub(currencyCode: String, currencyRate: Double, rubAmount: Double) {
        val convertSum = (rubAmount / currencyRate * 100).roundToInt()/100.00
        println("$rubAmount рублей = $convertSum $currencyCode")
    }


}