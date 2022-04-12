open class Mobile(var price : Int){
    fun makeCall(){
        println("Any mobile with price $price can make a call")
    }
    open fun  gaming(){
        if (price > 10000)
            println("Mobile will support Gaming")
        else
            println("Mobile will not support gaming")
    }
}

interface Apple{
    var camera : String                     // this is open by default and needs to be overridden
    fun takePhoto(){
        println("Apple takes super clear photos at night with ${camera}!")
    }
    fun gaming(){
        println("Apple Supports gaming")
    }
}

class IPhone13(price : Int, override var camera: String) : Mobile(price), Apple {
    override fun gaming() {
        println("IPHone 13 supports high quality gaming")
        // giving explicit calls to respective gaming methods
        super<Apple>.gaming()
        super<Mobile>.gaming()
    }

}

fun main (){
    val iphoneObj = IPhone13(1000, "Sony")
    // Gaming method will create an ambiguity if not properly overridden in the IPhone 13 class
    iphoneObj.gaming()
    // can call makeCall() from super class Mobile directly, no ambiguity
    iphoneObj.makeCall()
    //can call takePhoto() from interface Apple directly, no ambiguity
    iphoneObj.takePhoto()
}
