import kotlin.random.Random

object Channels {
    private val ChannelsList : List<String> = listOf(
        "1-novosti",
        "2-telemagazin",
        "3-sport",
        "4-muzika",
        "5-kino",
        "6-puteshestvia",
        "7-infokanal"
    )
    fun getRandomChannels(): List<String>{
        return ChannelsList.subList(0, ChannelsList.size - (1 .. ChannelsList.size - 2).random()).shuffled()
    }
    var listOfChannelsTv = Channels.getRandomChannels()

    fun listOfChannels () {
        println(" Список доступных каналов ")
        listOfChannelsTv.forEachIndexed { index, s ->  println("кнопка ${index + 1} - $s") }
        println("всего каналов ${(Channels.listOfChannelsTv.size)}")

    }


}