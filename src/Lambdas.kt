data class OTTUser (var userId : Int, var password : String, var subscriptionAmt : Double){

    //a Lambda assigned to a val, doing a changePassword Functionality
    val changePasswordLambda : (String) -> Boolean= { givenPassword ->
        if(!givenPassword.equals(this.password)){
            this.password = givenPassword
            println("Password changed")
            true
        }
        else{
            println("password already same")
            false
        }
    }
}
fun main(){
    val user1 = OTTUser(11, "12345678", 1200.0)
    val user2 = OTTUser(13, "22222222", 1800.0)

    user1.changePasswordLambda("12345678")
    println("New details of user 1 are - $user1")
    user2.changePasswordLambda("4321")
    println("New details of user 2 are - $user2")
}