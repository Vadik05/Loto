import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val myHashMap = hashMapOf(
        "user1" to "qwerty1",
        "user2" to "qwerty2",
        "user3" to "qwerty3"
    )
    var b = true
    do {
        println("Введите логин")
        val login = readLine().toString()
        println("Введите пароль")
        val password = readLine().toString()
        if (myHashMap[login] == password) {
            println("Добро пожаловать $login")
            b = true
            break
        } else {
            println("Неверный логин или пароль")
        }
    }while (myHashMap[login] != password)

}