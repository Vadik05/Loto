import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val loginBase: HashMap<String, String> = hashMapOf()
    val n = 3
    println("Регистрация пользователей")
    for (i in 1..n){
        println("Введите логин")
        val login: String? = readLine()
        println("Введите пароль")
        val password: String? = readLine()
        if (password != null) {
            loginBase.put(login.toString(), password)
        }
        loginBase[login] = password

    }

    var b = true
    do {
        println("Вход в учетную запись")
        println("Введите логин")
        val login = readLine().toString()
        println("Введите пароль")
        val password = readLine().toString()
        if (loginBase[login] == password) {
            println("Добро пожаловать $login")
            b = true
            break
        } else {
            println("Неверный логин или пароль")
        }
    }while (loginBase[login] != password)

}

private operator fun <K, V> HashMap<K, V>.set(login: V?, value: V?) {

}
