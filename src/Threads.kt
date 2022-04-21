import kotlin.concurrent.thread

class SimpleThread : Thread(){
    override fun run() {
        println("Running the simple thread code here .....")
        for(i in 1..3){
            println("$i Simple Thread")
            sleep(2000)
        }
    }
}

class RunnableThread : Runnable {
    override fun run() {
        println("Running the thread made by extending runnable interface .......")
        for(i in 1..3){
            println("$i Runnable Thread")
            Thread.sleep(3000)
        }
    }
}

fun main(){
    val simpleThread = SimpleThread()
    simpleThread.start()

    println("Main function code..... 1")
    val runnableThread = Thread(RunnableThread())
    runnableThread.start()

    val lamdaThread = Thread{
        println("Running the lambda thread.......")
        for(i in 1..3){
            println("$i Lambda Thread")
            Thread.sleep(4000)
        }
    }
    lamdaThread.start()

    println("Main function code..... 2")

    val functionalThread = thread (false, false, null, "functionThread", 4) {
        println("This is the thread using thread() function")
        for(i in 1..3) {
            println("$i Thread by function ....")
            Thread.sleep(8000)
        }
    }

    functionalThread.start() // this results in waited execution of the current thread until the thread that calls join() has already finished

    functionalThread.join()
    println("Main function code..... 3")
}