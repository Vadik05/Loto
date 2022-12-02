
abstract class CreditCard: BankCard(15000.00){
    val limit: Double = 10000.00
    override fun replenish() {
        super.replenish()
        println("Введите сумму пополнения")
        val sum = readln().toDouble()

        currentBalance = balance + sum + creditBalance

    }
    override fun getBalance(){
        println("На вашем счету $currentBalance")
    }

    override fun getFullBalance() {
        super.getFullBalance()
        println("У вас  -$currentBalance своих средств , кредитных - $creditBalance")
    }
}