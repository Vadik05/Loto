import kotlin.random.Random

fun main (){


//
//    ----------------------------Lesson 12 ----------------------
//
//    val list = List(5) {Random.nextInt()}
//    try {
//
//
//        for (i in 1 .. list.size)    //    Если вместо size поставить indices , то ошибки не будет
//            println(list[i])
//        println(" Ошибка! ")
//        }catch (e: IndexOutOfBoundsException) {
//            println(" Накосячили! ")
//        }finally {
//            println("Все заработало")
//        }



//    val wheel = Wheel()

val wheel = Wheel()
    wheel.getPressure()
    wheel.checkPressure()

}

class TooHighPressure : Throwable ("Давление слишком высокое")

class TooLowPressure : Throwable ("Давление слишком низкое")

class IncorrectPressure : Throwable ("Неверное значение")