fun main() {
    val fullString = "F2p)v\"y233{0->c}ttelciFc"
    val firstString = fullString.take(12)
    val secondString = fullString.takeLast(12)

    val newFirstString = firstString.map {char -> char + 1}.joinToString("").replace("5", "s").replace("4", "u").map {char -> char - 3}.joinToString("").replace("0", "o")
    val newSecondString = secondString.map {char -> char -4}.joinToString(" ").replace("_", " ")

    println(newFirstString + newSecondString)


}
