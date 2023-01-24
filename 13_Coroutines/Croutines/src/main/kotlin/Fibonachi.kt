import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.isActive
import java.lang.IndexOutOfBoundsException
import java.math.BigInteger

object Fibonachi {

    suspend fun take (n:Int) {
        var f1 = 0
        var f2 = 1
        var f3 = 0
        for (i in 2 .. n){
            f3 = f1 + f2
            f1 = f2
            f2 = f3
        }
        println(f3)
    }

}
