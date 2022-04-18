
import java.util.*

// Used functions normally
// And also as an expression
// And also with default parameters

const val FEE = 30000
class StudentResult(var name : String, var marks: Int, var scholarship : Double = 0.0) {

    fun calculateScholarship() =  if(this.marks in 90 until 95){
        80.0
        println("You get a decent scholarship !")
    }
    else if (this.marks in 95..100){
        println("You got a good scholarship !")
        90.0
    }
    else{
        println("You could not get any scholarship")
        0.0
    }

    fun checkIfPass() : Boolean{
        return this.marks>60
    }


    fun calculateFees(concession : Int = 0) : Double {
        var fee = FEE - ((scholarship / 100) * FEE)
        println(fee)
        return fee - concession
    }
}
fun main(){
    val sc= Scanner(System.`in`)
    println("Enter student name .....")
    val name = sc.next()
    println("Enter your marks ....")
    val marks = sc.nextInt()

    var stdobj = StudentResult(name, marks)

    if(stdobj.checkIfPass()){
        println("$name you got ${stdobj.calculateScholarship()} percentage of scholarship")
    }

    else
        println("$name you failed this examination")
    println(stdobj.scholarship)
    val fee = stdobj.calculateFees()
    println("$name fees is calculated to be $fee after considering the concession")
}


