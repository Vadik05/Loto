import kotlin.random.Random
import kotlin.random.nextInt

fun main(){

//    Первая часть задания 11


//    val object1 = Stack<Int> ()
//    println(object1.isEmpty())
//    object1.push(5)
//    println(object1.isEmpty())
//    val object2 = Stack<String> ()
//    println(object2.pop())
//    object2.push("Privet")
//    object2.push("Poka!")
//
//    println(object2.pop())
//    println(object2.isEmpty())

    println("Введите количество соперников")
    val numberOfWarriors = readln().toIntOrNull() ?: 0
    val goodVSbad = Battle()
    val goodteam = Team("First", numberOfWarriors = numberOfWarriors)
    val badTeam = Team("Second", numberOfWarriors = numberOfWarriors)
    goodVSbad.team1 = goodteam
    goodVSbad.team2 = badTeam

    var roundNumber = 1

    while (goodVSbad.getBattleState() is BattleState.Progress) {
        println("ROUND $roundNumber")
        goodVSbad.battleIteration()
        roundNumber++
    }



//    val battle = Battle()
//
//    while (battle.getBattleState() is BattleState.Progress) {
//        battle.battleIteration()
//    }

}
fun Int.chance(): Boolean {
    return this >= Random.nextInt(1..100)
}
