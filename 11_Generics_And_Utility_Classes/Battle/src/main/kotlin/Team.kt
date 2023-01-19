class Team(var teamName: String, var numberOfWarriors: Int) {

    var team: MutableList<AbstractWarrior> = mutableListOf()
    val general = General(false, 40)
    val capitan = Capitan(false, 30)
    val soldier = Soldier(false, 20)

    init {

        for (i in 1 .. numberOfWarriors) {
            if (20.chance()) {
                team.add(general)
            } else if ( 40.chance()) {
                team.add(capitan)
            }else {
                team.add(soldier)
            }
        }


    }

    override fun toString(): String {
        return "Team($team)"
    }


//    fun Int.chance(): Boolean {
//        return this >= Random.nextInt(1..100)
//    }

//    open fun getTeam(teamSize: Int): String {
//        repeat(teamSize) {
//            if (10.chance()) {
//                team.add(general)
//            } else if (40.chance()) {
//                team.add(capitan)
//            } else team.add(soldier)
//        }
//        return team.toString()
//    }


}



