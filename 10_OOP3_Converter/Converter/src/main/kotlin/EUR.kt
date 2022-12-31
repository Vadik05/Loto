import kotlin.math.roundToInt

class EUR:CurrencyConverter {
    override var currencyCode = "EUR"
    override fun convertToRub(currencyCode: String, currencyRate: Double, rubAmount: Double) {
        val convertSum = (rubAmount / currencyRate * 100).roundToInt()/100.00
        println("$rubAmount рублей = $convertSum $currencyCode")

    }

}
