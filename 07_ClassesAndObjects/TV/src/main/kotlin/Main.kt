

fun main() {
    val Samsung = Tv(brand = "Samsung", model = "BU8000", inch = 50.5 )
    val Panasonic = Tv(brand = "Panasonic", model = "LX650", inch = 52.0)
    val Philips = Tv(brand = "Philips", model = "5500", inch = 49.0)

    printinfo(Samsung)
    Samsung.turnOnPower()
    Samsung.printChannelList()
    Samsung.channelPlus(1)
    Channels.getRandomChannels()
    Channels.listOfChannels()
    Samsung.useVolumePlus(55)

    Samsung.channelMinus(1)



    printinfo(Panasonic)
    Panasonic.turnOnPower()
    Panasonic.channelPlus(2)
    Channels.getRandomChannels()
    Channels.listOfChannels()
    Panasonic.turnOffPower()



}
 fun printinfo (tv: Tv) {
     println("Brand - ${tv.brand}, Model - ${tv.model}, Inch - ${tv.inch}")
 }