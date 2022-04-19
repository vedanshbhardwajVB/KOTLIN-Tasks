import java.util.*

enum class TicketType(val cost:Int, val accessToPlayersPermission : Boolean = false)  : AllotSeat{
    REGULAR(1000) {
        override fun allotSeat() {
            println("Assigning seats out of the back 4 rows......")
        }
    },
    DELUXE(1800) {
        override fun allotSeat() {
            println("Assigning a seat from the middle 4 rows......")
        }
    },
    PREMIUM(2500, true) {
        override fun allotSeat() {
            println("Assigning a seat out of the first 4 rows")
        }
    }
}

interface AllotSeat{
    fun allotSeat()
}

fun main(){
    val sc = Scanner(System.`in`)
    val availableTicketType = TicketType.values()
    availableTicketType.forEach { println("$it / ") }

    println("Enter the type of ticket you want ?")
    val type = sc.nextLine()
    val oneTicketDetails = TicketType.valueOf(type)
    println("The ticket cost of $type ticket is ${oneTicketDetails.cost} \n And access to players is ${oneTicketDetails.accessToPlayersPermission}")
    oneTicketDetails.allotSeat()

    println("Your ticket group number is ${oneTicketDetails.ordinal}")
}