class Soldier (
    override var isKilled: Boolean = false,
    var evasion: Int,
    var nameUnit: String = "Soldier",
) : AbstractWarrior (
    600,
    70,
    400,
    weapon = Weapons.creatingMachineGun(),
    currentHealth = 500

)
