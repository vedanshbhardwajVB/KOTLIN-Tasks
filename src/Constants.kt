import java.util.*

const val sirname  = "Indian"
val sirname1  = "Indian"
class ConstantNameGenerator (var name : String){

    val middlename : String = ""
    fun createName() : String{
        return this.name+middlename+sirname
    }

    fun `by Anything`() {
        println("Inside by anything")
    }
    fun `in`(){
        
    }

}
fun main() {
    val sc = Scanner(System.`in`)
    println("Enter your firstname ...")
    val n = sc.next()

    val nameObj = ConstantNameGenerator(n)
    println("The full name is ${nameObj.createName()}")
}

