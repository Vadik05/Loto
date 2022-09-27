fun main() {
    val firstName = "Владислав"
    val lastName = "Кизин"
    var height: Double = 1.96
    var weight: Float = 98.5f
    val isChild = height < 1.5 || weight < 40
    println("Владислав ребёнок ? \n $isChild")
    val info: String = "имя -  $firstName , фамилия - $lastName , рост - $height , вес - $weight , Владислав ребенок ? - $isChild "
    println(info)
    var height2: Double = 1.88
    println(info.replace("$height", "$height2"))


}