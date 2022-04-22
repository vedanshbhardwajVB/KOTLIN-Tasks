import kotlin.concurrent.thread

class TrafficSystem(var greenLight : Boolean, var redLight : Boolean, var yellowLight : Boolean) : Runnable{

    @Volatile
    var runTrafficLight : Boolean = true
    override fun run() {
        println("Checking the signal.......")
        while(runTrafficLight){
            switchLight()
        }
    }

    private fun switchLight() {
        when{
            redLight -> println("STOP")
            yellowLight -> println("GET SET")
            greenLight -> println("GO")
        }
    }
}

fun main(){
    val system1 = TrafficSystem(false, true, false)
    val sys1Thread = Thread(system1)
    sys1Thread.start()

    val thr = thread (true){
        println("Switching on green light in other thread ....")
        system1.redLight=false
        system1.greenLight=true

        println("Time for traffic light getting over CLOSING the lights.....")
        system1.runTrafficLight = false
        println("Closed the Lights")


    }


}