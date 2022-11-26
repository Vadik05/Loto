open class NatureReserve {

    var natureReservePopulation = mutableListOf(
        Bird(nameArg = "Журавль", energyArg = 10, weightArg = 8, currentAgeArg = 4, maxAgeArg = 8),
        Bird(nameArg = "Орёл", energyArg = 10, weightArg = 7, currentAgeArg = 4, maxAgeArg = 8),
        Bird(nameArg = "Воробей", energyArg = 10, weightArg = 3, currentAgeArg = 3, maxAgeArg = 6),
        Bird(nameArg = "Сорока", energyArg = 10, weightArg = 4, currentAgeArg = 3, maxAgeArg = 6),
        Bird(nameArg = "Ворона", energyArg = 10, weightArg = 5, currentAgeArg = 3, maxAgeArg = 6),
        Fish(nameArg = "Окунь", energyArg = 9, weightArg = 8, currentAgeArg = 6, maxAgeArg = 10),
        Fish(nameArg = "Карась", energyArg = 9, weightArg = 5, currentAgeArg = 6, maxAgeArg = 10),
        Fish(nameArg = "Плотва", energyArg = 9, weightArg = 6, currentAgeArg = 6, maxAgeArg = 10),
        Dog(nameArg = "Овчарка", energyArg = 10, weightArg = 38, currentAgeArg = 6, maxAgeArg = 15),
        Dog(nameArg = "Такса", energyArg = 10, weightArg = 8, currentAgeArg = 5, maxAgeArg = 15),
        Anim(nameArg = "Динозавр", energyArg = 30, weightArg = 500, currentAgeArg = 50, maxAgeArg = 100),
        Anim(nameArg = "Слон", energyArg = 40, weightArg = 800, currentAgeArg = 80, maxAgeArg = 200)

    )
    open fun lifeCycle(numberOfCycle: Int){
        for(j in 1..numberOfCycle) {
            if (natureReservePopulation.isEmpty()) {
                println("Заповедник пуст")
                return
            }else{
                println("Цикл номер - $j")
                for (i in natureReservePopulation.indices) {
                    when ((1..4).random()) {
                        1 -> natureReservePopulation[i].sleep()
                        2 -> natureReservePopulation[i].move()
                        3 -> natureReservePopulation[i].eat()
                        4 -> {
                            val child = natureReservePopulation[i].animalBorn()
                            child?.let { natureReservePopulation.add(natureReservePopulation[i]) }
                        }
                    }
                }
                removeTooOld()
                println("Количество животных в зоопарке на текущий момент - ${natureReservePopulation.size}")
            }
        }

    }
    private fun removeTooOld() {
        val iterator = natureReservePopulation.iterator()
        while (iterator.hasNext()) {
            val item = iterator.next()
            if (item.isTooOld) {
                print("Животное ${item.name} умерло")
                iterator.remove()
            }

        }
    }
}

