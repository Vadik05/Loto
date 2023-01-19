
class Battle {
    var isGameOver: Boolean = true

    var team1 = Team("GoodBoys", 10)
    var team2 = Team("Boys", 10)

    fun getBattleState(): BattleState {
        return if (team2.team.size == 0 && team1.team.size > 0) {
            println(BattleState.Team1Win(team1, team2).stateMessage)
            BattleState.Team1Win(team1, team2)
        }else if  (team1.team.size == 0 && team2.team.size > 0) {
            println(BattleState.Team1Win(team1, team2).stateMessage)
            BattleState.Team2Win(team1, team2)
        }else {
            println(BattleState.Progress(team1, team2).stateMessage)
            BattleState.Progress(team1, team2)
        }
    }


    fun battleIteration() {
        val randomWarriorTeam1: AbstractWarrior = team1.team.random()
        var randomWarriorTeam2: AbstractWarrior= team2.team.random()

       for (i in 0 .. team1.team.lastIndex) {
           team1.team[i].attack(randomWarriorTeam2)
       }
       for (i in 0 .. team2.team.lastIndex) {
           team2.team[i].attack(randomWarriorTeam1)
       }
       team1.team.removeIf { it.currentHealth <= 0 }
       team2.team.removeIf { it.currentHealth <= 0 }
    }
}