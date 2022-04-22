enum class Subscription(val rechargeAmt : Double){
    MONTHLY(1000.0),
    QUARTERLY(1500.0),
    YEARLY(2000.0)
}
data class AppUser(var fullName : String, var password : String, var mobile : Long, var subscription : Subscription)
fun main() {
//    val `list is a list` = listOf<String>("One", "Two", "Three")
//    `list is a list`.forEach{
//        println(it)
//    }
//
//    `list is a list`[0] = "nothing" gives error as list is immutable
//
//    val  list = mutableListOf<String>("Four", "Five") // can use arrayListOf and ArrayList also
//    list.add("Six")
//    list.add(0, "Ten")
//
//    println(list)

    var user1 = AppUser("Virat Kohli","chiku18", 9191919191, Subscription.YEARLY )
    var user2 = AppUser("MS Dhoni","mahi77", 9191919192, Subscription.QUARTERLY)
    var user3 = AppUser("Sanju Samson","sanju27", 9191919193, Subscription.MONTHLY )
    var user4 = AppUser("Kane Williamson","willy01", 9191919194, Subscription.YEARLY )
    var user5 = AppUser("Yuzvendra Chahal","chahal21", 9191919195, Subscription.MONTHLY )

    var userList = arrayListOf(user1, user2, user3, user4, user5)
    //making a map out of the list item
    val numberMap = userList.associateBy({it.fullName}, {it.mobile})
    println(numberMap)

    //joining list items as a single string
    val names = userList.joinToString(",", "The name sof users are ", " Welcome to the app !"){
        it.fullName
    }
    println(names)

    val weakPasswordList = userList.filter { it.password.length <= 6 }
    println("Users with a weak passowrd are $weakPasswordList")

    //grouping by the type fo subscription
    val subscriptionGroup = userList.groupBy ({it.subscription}, {it.fullName})
    println(subscriptionGroup)

    //slicing and taking ...
    println(userList.slice(2..4))
    println(userList.slice(0..userList.size step 2))
    println(userList.takeLastWhile { it.password.length > 6 })

    //chunks of the list -> return list of lists of size = chunkSize
    println(userList.chunked(2)[1])

    //windowed view of the list
    userList.windowed(2) {
        it.forEach { print(it.fullName + " ") }
        print(",")
    }
    println()

    //retrieving a particular element
    println(userList.first())
    println(userList.first{
        it.fullName.endsWith("son") //first Sanju Samson, then Kane Williamson
    })

//    val sortedNames = userList.sortedBy { it.fullName }
    val sortedNames = userList.sortedBy { it.password //sortedBy does not change the original list-> return sorted list, sortBy does change the original list -> return nothing
    }
    println(sortedNames)
    println(userList)


}