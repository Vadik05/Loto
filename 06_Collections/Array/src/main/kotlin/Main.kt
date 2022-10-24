import kotlin.random.Random

fun main() {
    println("Введите N > 0")
    var N = readLine()?.toIntOrNull()?: return
    if (N < 0) {
        println("Число должно быть больше 0 ")
        N = readLine()?.toIntOrNull()?: return }
    else {
    val list = List(N) { Random.nextInt(-5, 5) }

    println(list)
    val mutablelist = list.toMutableList()
        println(mutablelist.map { if (it % 2 == 0) it * 10 else it } )
        println(mutablelist.sumBy{it})
        println(mutablelist.filter { it >0 })

    }
}
