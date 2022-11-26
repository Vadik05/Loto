open class Dog(nameArg: String, energyArg: Int, weightArg: Int, currentAgeArg: Int, maxAgeArg: Int): Animal (
    nameArg, energyArg, weightArg, currentAgeArg, maxAgeArg,
)
{
    override fun move() {
        super.move()
        println(" бежит ")
    }

    override fun animalBorn(): Dog {
        return Dog(name, Energy, weight, currentAge, maxAge)

    }
}
