import java.util.*

class Light {
    val heavyInstance : Heavy by lazy{
        val sc = Scanner(System.`in`)
        println("Enter name ")
        val name = sc.nextLine()
        println("Enter id")
        val id = sc.nextInt()
        Heavy(name, id)
    }

    fun heavyDetails(){
        println(heavyInstance)
    }
}

class Heavy (var heavyName : String, var heavyId : Int) {
    override fun toString(): String {
        return "$heavyName -> $heavyId"
    }
}