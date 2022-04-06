import kotlin.jvm.JvmStatic
import Convert.Laptop

object Convert {
    @JvmStatic
    fun main(args: Array<String>) {
        val l = Laptop("Mac", 8)
        val l2 = Laptop("HP", 4)
        val l3 = Laptop("Dell", 12)
        println("Price of laptop 1 is " + l.calculatePrice())
        println("Price of laptop 2 is " + l2.calculatePrice())
        println("Price of laptop 3 is " + l3.calculatePrice())
    }

    internal class Laptop(var company: String, var ram: Int) {
        fun calculatePrice(): Double {
            return if (company == "Mac") 10000000.25 else {
                if (ram <= 4) 1000.25 else if (ram > 4 && ram <= 8) 10000.25 else 100000.25
            }
        }
    }
}