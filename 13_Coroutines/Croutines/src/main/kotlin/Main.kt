
import kotlinx.coroutines.*
import java.math.BigInteger

fun main(): Unit = runBlocking {
    launch {
        var scop = CoroutineScope(Dispatchers.Default)
        try {
            withTimeout(1000) {
                var a = scop.launch {
                    println("launch 1 ${Fibonachi.take(545655599)}")

                }
            }
        } catch (t: TimeoutCancellationException) {
            println(t.message)
        }


        var b = scop.launch {
            delay(3000)
            Fibonachi.take(5)
        }
        var c = scop.launch {
            delay(5000)
            Fibonachi.take(10)
        }
        launch {
            while (b.isActive || c.isActive) {
                print(".")
            }
        }
    }
}






