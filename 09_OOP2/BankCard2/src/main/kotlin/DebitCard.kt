open class DebitCard() : BankCard() {
    override var balance: Double = 15000.0

    override fun replenish() {
        println("Введите сумму пополнения дебетовой карты")
        var sum = readlnOrNull()?.toIntOrNull()!!
        while (sum<=0) {
            println("Сумма должна быть больше нуля")
            sum = readlnOrNull()?.toIntOrNull()!!
        }

        balance += sum
        println("У вас на счету теперь $balance")
    }

    override fun currentBalance() {
        println("Текущий баланс DebitCard $balance")

    }

    override fun pay(): Boolean {
        println("Введите сумму для оплаты")
        val sum = readln().toInt()
        if ((balance - sum) > 0) {
            balance -= sum
            println("Оплата проведена, на счету $balance")
            return true
        } else {
            println("Недостаточно средств")
            return true
        }
    }

    override fun getFullBalance() {
        println("Общий баланс карты $balance")
    }

}