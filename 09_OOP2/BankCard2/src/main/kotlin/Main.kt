fun main(){

    val debitcard = DebitCard()
    debitcard.currentBalance()
    debitcard.replenish()
    debitcard.currentBalance()
    debitcard.pay()
    val creditCard = Creditcard()
    creditCard.getFullBalance()
    creditCard.replenish()
    creditCard.getFullBalance()
    creditCard.pay()
    creditCard.getFullBalance()

    val sbercard = SberCreditCard()
    sbercard.getFullBalance()
    sbercard.replenish()
    sbercard.pay()
    sbercard.getFullBalance()

    val alfacard = AlfaDebitCard()
    alfacard.getFullBalance()
    alfacard.pay()
    alfacard.currentBalance()


}