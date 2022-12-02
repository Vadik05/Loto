import kotlin.random.Random

open class Creditcard() : BankCard (){

    override var balance: Double = 10000.0
    open val creditLimit = 10000
    open var creditMoney:Double = Random.nextDouble(1.0 , 10000.0)
    open var finalBalance:Double = creditMoney + balance
    open val cashback:Double = 0.0


    override fun replenish() {
        println("Введите сумму пополнения кредитной карты")
        var sum = readlnOrNull()?.toIntOrNull()!!
        while (sum<=0) {
            println("Сумма должна быть больше нуля")
            sum = readlnOrNull()?.toIntOrNull()!!
        }
        when {
           creditMoney < creditLimit -> creditMoney += sum
           creditMoney >= creditLimit -> finalBalance += sum
        }
        finalBalance = creditMoney + balance
        println("У вас на счету всего $finalBalance")
    }

    override fun currentBalance() {
        println("Текущий баланс CreditCard $finalBalance")

    }

    override fun pay(): Boolean {
        println("Введите сумму для оплаты")
        val sum = readln().toInt()
        if ((finalBalance - sum) > 0) {
            finalBalance -= sum
            println("Оплата проведена, на счету $finalBalance")
            return true
        } else {
            println("Недостаточно средств")
            return true
        }
    }

    override fun getFullBalance() {
        println("Кредитная карта с лимитом $creditLimit, и итоговым балансом $finalBalance")
    }


}