open class Anim(nameArg: String, energyArg: Int, weightArg: Int, currentAgeArg: Int, maxAgeArg: Int): Animal (
    nameArg, energyArg, weightArg, currentAgeArg, maxAgeArg, )
{
    override fun move() {
        super.move()
        println(" Очень быстро бежит ")
    }

    override fun animalBorn(): Anim {
        return super.animalBorn() as Anim
    }
}