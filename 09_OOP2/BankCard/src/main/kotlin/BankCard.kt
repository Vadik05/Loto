import kotlin.random.Random

abstract class BankCard (
    var balance:Double
) {
    abstract var pay:Double
    abstract var currentBalance: Double
    abstract var creditLimit:Double
    var creditBalance: Double = 10000.0
    var fullBalance:Double = balance + creditBalance

    open fun pay():Boolean {
        println("Введите сумму платежа")
        val pay = readln().toDouble()
        if (currentBalance <= pay){
            println("недостаточно средств")
            return true
        }

    open fun replenish() {
        println("Введите сумму пополнения")
        val n = readln().toDouble()
        if (creditBalance < creditLimit){


        }
    }

    open fun getBalance() {
        println("Ваши средства - $balance")
    }

    open fun getFullBalance() {
        println("Все ваши средства - $fullBalance")
    }
}

