import java.util.*

class Light {
    private val heavyInstance : Heavy by lazy{
        val sc = Scanner(System.`in`)
        println("Enter name ")
        val name = sc.nextLine()
        println("Enter id")
        val id = sc.nextInt()
        Heavy(name, id)
    }

    fun heavyDetails(){
        println(heavyInstance)
        println(heavyInstance.display())
    }
}

class Heavy (var heavyName : String, var heavyId : Int) {
     fun display(): String {
        return "$heavyName -> $heavyId"
    }
}

fun main () {
    val lightObject = Light()
    lightObject.heavyDetails()
    lightObject.heavyDetails()
}