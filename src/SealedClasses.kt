sealed class Consumer(val id : Int){
    class RegularUser(id : Int, var canOrderAtNight : Boolean) : Consumer(id){
    }

    class PremiumUser(id : Int, var canOrderAtNight: Boolean = true, val permDiscount : Int = 50) : Consumer(id){
    }

    class Admin (id : Int, var canModifyUserRights : Boolean = true, val permDiscount: Int = 100) : Consumer(id){
    }
    fun getDetails() {
        when(this) {
            is RegularUser -> {
                println("""This is a regular user. 
                | User id => $id
                | Order At Night Facility available -> $canOrderAtNight
            """.trimMargin())
            }
            is PremiumUser -> {
                println("""This is a Premium user. 
                | User id => $id
                | Order At Night Facility available -> $canOrderAtNight
                | Permanent Discount -> $permDiscount
            """.trimMargin())
            }
            is Admin -> {
                println("""This is a Admin. 
                | User id => $id
                | Can modify user information -> $canModifyUserRights
                | Permanent Discount -> $permDiscount
            """.trimMargin())
            }
        }
    }
}

fun main (){
    val regUserObj = Consumer.RegularUser(12, false)
    val preUserObj = Consumer.PremiumUser(20)
    val adminUserObj = Consumer.Admin(100)

    regUserObj.getDetails()
    println("_______________________________________________________")
    preUserObj.getDetails()
    println("_______________________________________________________")
    adminUserObj.getDetails()
    println("_______________________________________________________")
}

