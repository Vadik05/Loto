object Weapons {

    fun createPistol(): AbstractWeapon {
        return object  : AbstractWeapon(
            fireType = FireType.SingleShot,
            maxAmmo = 7,
            typeWeapon =  "pistol"
        ){
            override fun creatingPatron(): Ammo = Ammo.EXPLOSIVE
        }

    }
      fun creatingMachineGun(): AbstractWeapon {
          return object  : AbstractWeapon (
              fireType = FireType.MultiShot(),
              maxAmmo = 20,
              typeWeapon = "MachineGun",
          ){
              override fun creatingPatron(): Ammo = Ammo.SIMPLE

          }
      }
    fun creatingSubMachineGun(): AbstractWeapon {
        return object : AbstractWeapon (
            fireType = FireType.AutomaticFire(),
            maxAmmo = 30,
            typeWeapon = "AutomaticFire",
        ){
            override fun creatingPatron(): Ammo = Ammo.BUCKSHOT
        }
    }
}