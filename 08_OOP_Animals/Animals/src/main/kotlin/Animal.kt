import kotlin.random.Random

open class Animal(
    val name: String,
    var Energy: Int,
    val weight: Int,
    val currentAge: Int,
    val maxAge: Int,
    var isTooOld: Boolean = currentAge >= maxAge
) {
    fun sleep() {
        var Energy = Energy + 5
        var currentAge = currentAge + 1
        var isToOld : Boolean = currentAge >= maxAge
        println("${name} Спит")
    }
    fun eat() {
        var Energy = Energy + 3
        var weight = weight + 1
        var currentAge = (0..1).random()
        println("${name} Ест")
    }

    open fun move() {
        var Energy = Energy - 5
        var weight = weight - 1
        var currentAge = (0..1).random()
        println("${name} Двигается")
    }

    open fun tryIncrementAge(){
        if(Random.nextBoolean()){
            currentAge >= maxAge || weight < 2 || Energy < 6
        }
    }
    open fun animalBorn() : Animal {

        var childName = this.name
        var childEnergy = (1..10).random()
        var childWeight = (1..5).random()
        var childMaxAge = this.maxAge
        println("В заповеднике родился ${childName}, энергия - ${childEnergy}, вес - ${childWeight}," +
                " максимальный возраст - ${childMaxAge}")
        return animalBorn()
    }
}