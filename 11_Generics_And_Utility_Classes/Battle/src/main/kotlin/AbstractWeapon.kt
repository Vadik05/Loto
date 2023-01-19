abstract class AbstractWeapon(
    val maxAmmo: Int,
    var fireType: FireType,
    var magazine: Stack<Ammo> = Stack(),
    var isEmpty: Boolean = true,
    var typeWeapon: String

    ) {

    open fun magazineIsEmpty(): Boolean {
        isEmpty = magazine.isEmpty()
        return isEmpty

    }

    abstract fun creatingPatron(): Ammo

    open fun reloadWeapon() {
        for (i in magazine.stack.size until maxAmmo) {
            magazine.push(creatingPatron())
        }
        magazine.isEmpty()
    }



    open fun getAmmo(): Stack<Ammo> {
        val stackForShot: Stack<Ammo> = Stack()
        if (!magazine.isEmpty()) {
        when (fireType) {
            is FireType.SingleShot -> {
                if (!magazineIsEmpty())
                    magazine.pop()?.let { stackForShot.push(it) }
            }

            is FireType.MultiShot -> {
                if (magazine.stack.size >= (fireType as FireType.MultiShot).shortLength) {
                    for (i in 1..(fireType as FireType.MultiShot).shortLength) {
                        magazine.pop()?.let { stackForShot.push(it) }
                        }
                    }
                }
            is FireType.AutomaticFire -> {
                if (magazine.stack.size >= (fireType as FireType.AutomaticFire).shortLength) {
                    for (i in 1..(fireType as FireType.AutomaticFire).shortLength) {
                        magazine.pop()?.let { stackForShot.push(it) }
                    }
                }
            }


        }
        }
        magazineIsEmpty()
        return stackForShot

    }


}