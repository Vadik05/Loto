import java.util.*


sealed class BattleState {
    class Team1Win(val team1: Team, val team2: Team) : BattleState()

    class Team2Win(val team1: Team, val team2: Team) :BattleState()

    class Progress(private val team1: Team, private val team2: Team) : BattleState() {
        val progressInfo: String
            get() = ("${team2.teamName} (total HP - ${team2.team.sumOf { it.currentHealth }}"  +
                    "  (units - ${team2.team.size}))" +
                    "     VS    ${team1.teamName}  (total HP - ${team1.team.sumOf { it.currentHealth }}" +
                    "  (units - ${team1.team.size}))").uppercase(Locale.getDefault())
    }

    val stateMessage: String
        get() = when (this) {
            is Team1Win -> "\n\n${team1.teamName} win\n"
            is Team2Win -> "\n\n${team2.teamName} win\n"
            is Progress ->
                "............................................................................." +
                        "\n$progressInfo\n" +
                        "..........................................................................." +
                        "\nBATTLE...\n"

        }


}




