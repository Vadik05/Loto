import kotlinx.coroutines.launch
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import java.util.Collections.shuffle


suspend fun main() {
    runBlocking {
        launch {

            val player1 = Player()
            println("Карта первого игрока :")
            player1.getCard()

            val player2 = Player()
            println("Карта второго игрока :")
            player2.getCard()

            var counter = 0
            var coin1 = 0
            var coin2 = 0

            Generator.sharedFlow.collect {
                println("Ход ${counter + 1}. Выпал номер $it")
                counter++
                for (row in player1.card) {
                    for (cell in row) {
                        if (it == cell) {
                            coin1++
                            println("Совпадение у первого игрока !")
                            if (coin1 == 15) {
                                println("Игрок 1 выиграл !")
                                yield()
                                cancel()
                            }
                        }
                    }

                }
                for (row in player2.card) {
                    for (cell in row) {
                        if (it == cell) {
                            coin2++
                            println("Совпадение у второго игрока !")
                            if (coin2 == 15) {
                                println("Игрок 2 выиграл !")
                                yield()
                                cancel()
                            }
                        }
                    }

                }

            }
        }

    }

}






object Generator {
        private val scope = CoroutineScope(Job() + Dispatchers.Default)
        private val sharedFlowOne = MutableSharedFlow<Int>()
        val sharedFlow = sharedFlowOne.asSharedFlow()

        init {
            scope.launch {
                val barrel: MutableList<Int> = (1..90).toMutableList()
                shuffle(barrel)
                for (it in 0 until barrel.size) {
                    sharedFlowOne.emit(barrel[it])
                    delay(1000)
                }
                scope.cancel()
            }
        }
    }


