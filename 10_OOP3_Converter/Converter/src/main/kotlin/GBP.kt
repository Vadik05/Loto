import kotlin.math.roundToInt

class GBP:CurrencyConverter {
    override var currencyCode = "GBP"
    override fun convertToRub(currencyCode: String, currencyRate: Double, rubAmount: Double) {
        val convertSum = (rubAmount / currencyRate * 100).roundToInt()/100.00
        println("$rubAmount рублей = $convertSum $currencyCode")
    }

}