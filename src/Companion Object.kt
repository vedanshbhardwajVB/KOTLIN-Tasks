class User (var username : String){
    var userId : Int = -1
    init{
        this.userId = id++
    }
    companion object {
        var id: Int = 1
        fun appTour() {
            println("Giving an app tour of all the things in the app.....")
        }
    }
    fun changeName(newName : String){
        this.username = newName
        println("Username is changed to $username")
    }

    override fun toString(): String {
        return "$userId -> $username"
    }
}

fun main(){
    var user1 = User("Dhoni")
    var user2 = User("Sachin")
    var user3 = User("Virat")

    User.appTour()
    println(user1)
    println(user2)
    println(user3)

    user2.changeName("Ganguly")
    println(user2)

}