import java.util.Collections.shuffle

class Player() {
    var card = Array(3){Array(9){1} }
    fun getCard() {

        val listNumber: MutableList<Int> = (1..90).toMutableList()
        shuffle(listNumber)
        val one = listNumber.subList(0, 5)
        val two = listNumber.subList(6, 11)
        val three = listNumber.subList(12, 17)
        for (i in card.indices) {
            for (row in 0 until 9) {
                card[0] = one.toTypedArray()
                card[1] = two.toTypedArray()
                card[2] = three.toTypedArray()
            }
        }
        println("Получена карта :")
        for (row in card) {
            for (cell in row) {
                print("|$cell\t")
            }
            println("|")
        }

    }
}