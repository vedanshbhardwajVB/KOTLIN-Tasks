
import java.util.*

// Used functions normally
// And also as an expression
// And also with default parameters
const val FEE = 30000
fun main(){
    var sc= Scanner(System.`in`)
    println("Enter student name .....")
    var name = readLine()
    println("Enter your marks ....")
    var marks = sc.nextInt()
    var scholarship : Double = 0.0
    if(checkIfPass(marks)){
        scholarship = calculateScholarship(marks)
        println("$name you got $scholarship percentage of scholarship")
    }

    else
        println("$name you failed this examination")
    println(scholarship)
    var fee = calculateFees(scholarship)

    println("$name fees is calculated to be $fee")
}

fun calculateFees(scholarship: Double, concession : Int = 0) : Double {
    var fee = FEE - ((scholarship / 100) * FEE)
    println(fee)
    return fee - concession
}
fun calculateScholarship(marks: Int) = if(marks in 90 until 95){
                                                 println("You get a decent scholarship !")
                                                   80.0
                                                }
                                               else if (marks in 95..100){
                                                   println("You got a good scholarship !")
                                                    90.0
                                               }
                                                else{
                                                    println("You could not get any scholarship")
                                                    0.0
                                                }

fun checkIfPass(marks: Int) : Boolean{
    return marks>60
}

