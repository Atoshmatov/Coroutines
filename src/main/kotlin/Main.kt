import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Salom Alimardon")
    }

    println("Xayr Alimardon --> ${coroutineContext.job.isCancelled}")
}