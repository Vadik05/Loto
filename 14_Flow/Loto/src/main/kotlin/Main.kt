import kotlinx.coroutines.launch
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import java.util.Collections.shuffle


fun main() {
    val player1 = Player()
    player1.getCard()
    println(player1.card)

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
                    delay(300)
                }
                scope.cancel()
            }
        }
    }


