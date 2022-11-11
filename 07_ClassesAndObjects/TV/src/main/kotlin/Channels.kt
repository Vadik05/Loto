import kotlin.random.Random

object Channels {
    private val ChannelsList : List<String> = listOf(
        "novosti",
        "telemagazin",
        "sport",
        "muzika",
        "kino",
        "puteshestvia",
        "infokanal"
    )
    fun getRandomChannels(): List<String>{
        return ChannelsList.subList(0, ChannelsList.size - (1 .. ChannelsList.size - 2).random()).shuffled()
    }
    var listOfChannelsTv = Channels.getRandomChannels()

    fun listOfChannels () {
        println(" Список доступных каналов ")
        listOfChannelsTv.forEachIndexed { index, s ->  println("канал ${index + 1} - $s") }
        println("всего каналов ${(Channels.listOfChannelsTv.size)}")

    }


}