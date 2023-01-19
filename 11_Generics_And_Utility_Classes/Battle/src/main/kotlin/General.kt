class General (
    override var isKilled: Boolean = false,
    var evasion: Int ,
    var nameUnit: String = "General",
) : AbstractWarrior (
    900,
    60,
    350,
    weapon = Weapons.createPistol(),
    currentHealth = 800,
    )
