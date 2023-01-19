class Capitan(
    override var isKilled: Boolean = false,
    var evasion: Int ,
    var nameUnit: String = "General",
) : AbstractWarrior (
    600,
    80,
    350,
    weapon = Weapons.creatingSubMachineGun(),
    currentHealth = 450,

    )