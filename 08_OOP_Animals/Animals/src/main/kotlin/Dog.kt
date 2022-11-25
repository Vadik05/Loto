open class Dog(nameArg: String, energyArg: Int, weightArg: Int, currentAgeArg: Int, maxAgeArg: Int): Animal (
    nameArg, energyArg, weightArg, currentAgeArg, maxAgeArg,
)
{
    override fun move() {
        super.move()
        println(" бежит ")
    }

    override fun animalBorn() {
        super.animalBorn()
    }
}
