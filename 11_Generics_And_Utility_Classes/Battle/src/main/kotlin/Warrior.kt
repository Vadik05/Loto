interface Warrior {
    var  isKilled: Boolean
    var dodgeChance: Int

    fun attack(enemyWarrior: Warrior)
    fun takeDamage(damage: Int)
}