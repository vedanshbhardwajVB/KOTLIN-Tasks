
fun main(){
    fun details(){
        println("This is the main functions' details.")
    }
    class Road (var length : Int, var breadth : Int){
        fun details(){
            println("This road is of length $length and breadth $breadth.")
        }

        fun callDetailFunction(callRoadDetail : Boolean = true){
            if(!callRoadDetail)
                details()
            else
                this.details()
        }
    }



    val road = Road(50, 1)
    road.callDetailFunction(false)

}