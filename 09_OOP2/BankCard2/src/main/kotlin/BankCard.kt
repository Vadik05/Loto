import kotlin.random.Random

abstract class BankCard (){
    abstract var balance:Double
    abstract fun replenish()
    abstract fun currentBalance()
    abstract fun pay(): Boolean
    abstract fun getFullBalance()

}
