import kotlinx.coroutines.*

@OptIn(DelicateCoroutinesApi::class)
fun main() {
    GlobalScope.launch {
        task2()
    }
    task1()
    Thread.sleep(2000L)
}

fun task1() {
    print("Hello ")
    print(Thread.currentThread().name)
}

suspend fun task2() {
    withContext(Dispatchers.IO) {
        delay(1000L)
        print("World!")
        print(Thread.currentThread().name)
    }
}
