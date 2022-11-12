

fun main() {
    val Samsung = Tv(brand = "Samsung", model = "BU8000", inch = 50.5 )
    val Panasonic = Tv(brand = "Panasonic", model = "LX650", inch = 52.0)
    val Philips = Tv(brand = "Philips", model = "5500", inch = 49.0)

    printinfo(Samsung)
    Samsung.turnOnPower()
    Channels.listOfChannels()         // Получаем список каналов из Channels
    Samsung.channelPlus(1)
    Samsung.channelMinus(1)
    Samsung.useVolume(1)
    Samsung.turnOffPower()



    printinfo(Panasonic)
    Panasonic.turnOnPower()
    Channels.listOfChannels()     // Получаем список каналов  из Channels
    Panasonic.channelPlus(1)
    Panasonic.channelMinus(1)
    Panasonic.useVolume(1)
    Panasonic.turnOffPower()


    printinfo(Philips)
    Philips.turnOnPower()
    Philips.channelPlus(1)
    Channels.listOfChannels()
    Philips.channelMinus(1)
    Philips.useVolume(1)
    Philips.turnOffPower()



}
 fun printinfo (tv: Tv) {
     println("Brand - ${tv.brand}, Model - ${tv.model}, Inch - ${tv.inch}")
 }