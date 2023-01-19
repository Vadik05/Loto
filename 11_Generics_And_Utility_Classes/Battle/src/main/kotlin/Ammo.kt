enum class Ammo(
    var mainDamage: Int,
    private var criticalDamageChance: Int,
    private var criticalDamageCoeff: Int
) {
    EXPLOSIVE(10,30,5),
    SIMPLE(5,20,4),
    BUCKSHOT(15,10,2);

    fun currentDamage():Int {
        val currentDamage: Int = if (criticalDamageChance.chance()) {
            mainDamage * criticalDamageCoeff
        }else {
            mainDamage
        }
        return currentDamage
    }
}