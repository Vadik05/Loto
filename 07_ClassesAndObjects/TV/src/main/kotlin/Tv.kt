import kotlin.random.Random

class Tv (val brand: String, val model: String, val inch: Double,){

    var currentChannel = 1
    val volumeCount = 0

//    init {
//        println(" ваш телевизор создан")
//        Channels.getRandomChannels()
//        println(" список каналов создан")
//
//    }



    private var powerOn = false
    fun turnOnPower(){
        println("Телевизор включен")
        powerOn = true
    }
    fun turnOffPower(){
        println("Телевизор выключен")
        powerOn = false
    }

    fun channelPlus(channel : Int){
        currentChannel += channel
        println("Канал переключен")

    }

    fun channelMinus(channel: Int){
        currentChannel -= channel
        println("Канал переключен")

    }
    fun printChannelList() {

    }
    fun useVolumePlus (volume : Int){
        val volume = Random.nextInt(1, 50)
        println("Текущая громкость $volume")
    }



    companion object{
        const val maxVolume = 50
    }
}