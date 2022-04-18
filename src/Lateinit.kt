import java.util.*

class UserAccount (var userName : String){
    lateinit var userPassword : String

    fun createPassord(input : String){
        this.userPassword = input
    }
    fun validateAccess(input : String){
        if (input.equals(userPassword))
            println("Passwords Match")
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    println("Enter username......")
    var acc = UserAccount(sc.nextLine())

    println("Create Password")
    acc.createPassord(sc.nextLine())

    println("Login with password .......")
    acc.validateAccess(sc.nextLine())
}
