import kotlin.random.Random

class Tv (val brand: String, val model: String, val inch: Double,){

    var currentChannel = 1

    private var powerOn = false

    fun turnOnPower(){
        println("Телевизор включен")
        powerOn = true
    }
    fun turnOffPower(){
        println("Телевизор выключен")
        powerOn = false
    }

    fun channelPlus(channel: Int){
        println("Текущий канал " + currentChannel)
        currentChannel += channel
        if (channel > 0 && channel <= Channels.listOfChannelsTv.size){
            Channels.listOfChannelsTv.forEachIndexed { index,  s ->
                if ( channel == index + 1) currentChannel = channel
            }
            println("Номер канала увеличен на +1")
            println("Включен канал ${currentChannel + 1} ")

        }else {
            println("Канал не настроен")
        }
    }

    fun channelMinus(channel: Int){
        currentChannel -= channel
        if (currentChannel < 1) {
            currentChannel = 1
            println("Переключаем на -1")
            println("номер канала уменьшен максимально")
        }
        else
        println("Канал переключен на -1")
        println("Текущий канал $currentChannel")

    }

    fun newChannels(){
    Channels.getRandomChannels()
    }
    fun listOfChannelsTv() {
        Channels.listOfChannels()
    }

    fun useVolume (volumeCount : Int): Int {
        var volumeCount = Random.nextInt(1, 50)
        println("Текущая громкость $volumeCount")
        println("Увеличиваем громкость на 5")
        volumeCount = volumeCount + 5
        println("Текущая громкость $volumeCount")
        volumeCount = volumeCount - 7
        println("Уменьшаем громкость на 7")
        println("Текущая громкость $volumeCount")
        return volumeCount

    }







    companion object{
        const val maxVolume = 50
        const val minVolume = 0
    }
}