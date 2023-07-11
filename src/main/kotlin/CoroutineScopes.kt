import kotlinx.coroutines.*

fun main()  = runBlocking{
    val scope = CoroutineScope(CoroutineName("Alimardon"))
    println(scope.coroutineContext.toString())
    println(scope.isActive.toString())
    scope.launch {
        println(this.coroutineContext.toString())
    }
    return@runBlocking
}