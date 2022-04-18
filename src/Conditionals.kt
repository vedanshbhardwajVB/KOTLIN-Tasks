fun main() {
    val a = 120
    val b = 200

    val m = checkMagnitude(a,b)

    when  {
        m is Int  -> {
            println("m is equal to 0")
            println("Magnitude is same")
        }
        m in 50 until 100  -> println("Difference is there by a good margin")
        else -> println("Negligible difference")
    }
}

fun checkMagnitude(a : Int, b: Int) : Int{
    val max = if( a>b ) {
        println("A is bigger")
        a
    }
    else if(a == b){
        println("Both are equal")
        0
    }
    else{
        println("B is bigger")
        b
    }
    return max
}