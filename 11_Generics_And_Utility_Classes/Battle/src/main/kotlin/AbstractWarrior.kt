abstract class AbstractWarrior(
    val maxHealth: Int,
    avoidance: Int,
    private val accuracy: Int,
    var currentHealth: Int = maxHealth,
    private val weapon: AbstractWeapon,

): Warrior {
    override var dodgeChance: Int = avoidance

    override var isKilled: Boolean = false
        get() = currentHealth<= 0

    override fun takeDamage(damage: Int) {
        currentHealth -= damage
        isKilled = currentHealth <= 0
    }

    override fun attack(enemyWarrior: Warrior) {
        if (weapon.magazineIsEmpty()) {
            println(" Перезарядка ")
            weapon.reloadWeapon()
        } else {
            print(" Выстрел ! ")
            weapon.getAmmo().stack.forEach {
                if (accuracy.chance()) {
                    if (enemyWarrior.dodgeChance.chance()) {
                        println(" Уклонился, урона нет  ")
                    }else {
                        val damage = it.currentDamage()
                        enemyWarrior.takeDamage(damage)
                        if (damage > weapon.creatingPatron().mainDamage){
                            println(" Критический урон  $damage  ")
                        }else {
                            println(" Урон  $damage ")
                        }
                    }
                }else {
                    println(" Мимо ! ")
                }
            }
            println("---------------------------------------------------------")
        }
    }

}