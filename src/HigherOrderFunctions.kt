import java.util.*
/*
 Higher Order Functions are those that either take a function as input,
* or return a function,
* or do both !
* */
data class Consumers(var id : Int, var name : String, var password : String) {
    fun authenticate(inputPass : String, welcomeUser : () -> Unit, redirectUser : ()-> Unit){
        if(this.password.equals(inputPass)){
            welcomeUser()
        }
        else{
            redirectUser()
        }
        return
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    val c1 = Consumers(11, "Aman", "1234")

    println("Enter your password.....")
    val inputPass = sc.nextLine()

    c1.authenticate(inputPass, {
        println("Your password is correct !")
        println("Take an app tour !!")
        },
                                {
        println("Your password is wrong !")
        println("Redirecting..... !!")
    })

}


