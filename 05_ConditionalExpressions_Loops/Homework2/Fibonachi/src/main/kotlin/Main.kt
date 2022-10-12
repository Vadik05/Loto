fun main() {
    println("Введите n > 0")
    var n  = readLine()?.toIntOrNull()?: return
    if (n <= 0 || n > 47) {
        println("Число должно быть больше 0 и меньше 47")
        n = readLine()?.toIntOrNull()?:return

    }
    if (n <= 1 || n == 2){
        println("1")
    }
    else {(fib(n))}
}
fun fib (n: Int) {
    var f1 = 0
    var f2 = 1
    var f3 = 0
    for (j in 2 .. n){
        f3 = f1 + f2
        f1 = f2
        f2 = f3
    }
  println(f3)
}