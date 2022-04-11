import kotlin.jvm.JvmStatic

object Calculations {
    @JvmStatic
    fun main(args: Array<String>) {
        sayHelloFromKotlin()
        println(subtract(100, 50))
    }

    fun sayHelloFromJava() {
        println("Hello Kotlin file - I'm from JAVA ")
    }

    fun add(a: Int, b: Int): String {
        return "Java file subtracting.... Answer is " + (a + b)
    }
}