/*
When we need a class to store data of different enitities considering the following use cases ->
1. The class must have a toString() method
2. The entities must be comparable (must have equals() and hashCode() method )
3. Must be copyable, based on the Data of one object, we use a DATA CLASS

--> Often used to map the json Responses to the working code
*/

data class Recharge(val rechargeAmount : Int, val userId : Int){
    fun doRecharge(amt : Int) {
        if(amt >= 250)
            println("Recharge successful")
        else
            println("Recharge failed")
    }
}

fun main (){
    val rc1 = Recharge(200, 1)
    val rc2 = Recharge(280, 2)
    val repeatCharge = rc2.copy(rechargeAmount = 300) //can copy
    val rc3 = Recharge(200, 1)

    //automatically invokes a built - in toString()
    println(rc1)
    println(repeatCharge)

    // can compare based on values only
    if(rc1 == rc3)
        println("1 and 3 are the same recharges")
    else
        println("1 and 3 are two different recharges")

    //everything else works as normal class
    rc2.doRecharge(150)
}