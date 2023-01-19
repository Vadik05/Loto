sealed class FireType {




    object SingleShot: FireType ()

    class MultiShot : FireType () {
        var shortLength: Int = 30
    }

    class AutomaticFire : FireType () {
        val shortLength: Int = 50
    }
}
