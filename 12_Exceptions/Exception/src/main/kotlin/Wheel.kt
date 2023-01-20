class Wheel {
    var currentPressure : Double = 0.0
    fun getPressure(){
        println("Введите значение давления накачки колеса")
        var pressure = readLine()?.toDoubleOrNull()!!
        currentPressure += pressure
        return

    }

    fun checkPressure() {
        when (currentPressure) {
            in 2.6..10.0 -> throw TooHighPressure()
            in 0.0..1.5 -> throw  TooLowPressure()
            in 1.6..2.5 -> println("Колесо накачали, давление в норме")
            else -> throw IncorrectPressure()
        }


    }
}