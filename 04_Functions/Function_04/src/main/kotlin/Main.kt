fun main() {
    val fullString = "F2p)v\"y233{0->c}ttelciFc"
    val firstString = fullString.take(12)
    val secondString = fullString.takeLast(12)

    println(newFirstString(firstString) + newSecondString(secondString))
}



fun newFirstString(firstString: String): String {
    return firstString.map { char -> char + 1 }.joinToString("").replace("5", "s").replace("4", "u")
        .map { char -> char - 3 }
        .joinToString("").replace("0", "o")
}
fun newSecondString(secondString: String): String = secondString.reversed().map { char -> char - 4 }.joinToString("").replace("_", " ")


