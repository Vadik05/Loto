fun main() {
    val firstName = "Владислав"
    val lastName = "Кизин"
    var height: Double = 1.96
    var weight: Float = 98.5f
    val isChild = height < 1.5 || weight < 40
    println("Владислав ребёнок ? \n $isChild")
    val info: String = "имя = "  + firstName + "\n" + "фамилия = " + lastName + "\n" +
            "рост = " + height + "\n" + "вес = " + weight + "\n" +
            "Владислав ребенок ?" + "\n" +  isChild
    println(info)
    height = 1.49
    println("Новый рост = " + height)
    println(info.replace("height", "height2"))


}