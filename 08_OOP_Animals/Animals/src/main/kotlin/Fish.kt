open class Fish(nameArg: String, energyArg: Int, weightArg: Int, currentAgeArg: Int, maxAgeArg: Int): Animal (
    nameArg, energyArg, weightArg, currentAgeArg, maxAgeArg,
)
{
    override fun move() {
        super.move()
        println(" плывет ")
    }

    override fun animalBorn() {
        super.animalBorn()
    }
}
