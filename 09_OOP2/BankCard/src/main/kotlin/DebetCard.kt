
abstract class DebetCard : BankCard(15000.00){
    override fun replenish() {
        super.replenish()
        println("Введите сумму пополнения")
        val sum = readln().toDouble()
        currentBalance = balance + sum

    }
    override fun getBalance(){
        println("На вашем счету $currentBalance")
    }
}