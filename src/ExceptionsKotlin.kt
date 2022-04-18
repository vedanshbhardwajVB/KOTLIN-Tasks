import java.util.*

class ExceptionsKotlin {
    fun divider (num1 : Int, num2 : Int) : String{
        // using try catch as an expression+

        val output = try{
            val result = num1/num2
            "The result is $result"
        }
        catch (e : Exception){
            "Dividing by zero is not allowed !! "
        }
        finally {
            println("Done Calculation")
        }
        return output
    }
}

class CustomException(errMsg : String) : Exception(errMsg)

fun main(){
    val obj = ExceptionsKotlin()
    println(obj.divider(20, 10))
    println("____________________________________________________________")
    println(obj.divider(20, 0))
    println("____________________________________________________________")

    val sc = Scanner(System.`in`)
    println("Enter your username ")
    val username = sc.nextLine()
        if(username.contains(" ")){
            throw CustomException("User name cannot have spaces, TRY AGAIN !!")
        }
        else{
            println("That is a valid username, Welcome $username")
        }

}
