import kotlin.random.Random

open class Animal(val name: String, var Energy: Int, val weight: Int, val currentAge: Int, val maxAge: Int) {
    fun sleep() {
        var Energy = Energy + 5
        var currentAge = currentAge + 1
        println("${name}Sleep")
    }
    fun eat() {
        var Energy = Energy + 3
        var weight = weight + 1
        var currentAge = (0..1).random()
        println("${name}Eat")
    }

    open fun move() {
        var Energy = Energy - 5
        var weight = weight - 1
        var currentAge = (0..1).random()
        println("Move")
    }
    fun isToOld() {
        if (currentAge >= maxAge)
            println("isToOld - true")
        else
            println("isToOld - false")
    }
    fun tryIncrementAge(){
        if(Random.nextBoolean()){
            currentAge >= maxAge || weight < 2 || Energy < 6

        }
    }
    open fun animalBorn(){
        var childName = this.name
        var childEnergy = (1..10).random()
        var childWeight = (1..5).random()
        println("В заповеднике родился ${childName}, энергия - ${childEnergy}, вес - ${childWeight}")
    }
}