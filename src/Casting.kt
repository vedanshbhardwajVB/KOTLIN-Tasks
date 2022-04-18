fun main(){
    val intValue = 65
    // var longValue : Long = intValue -> will give error as in Kotlin, smaller data types cannot be automatically converted to Larger data types
    val longValue : Long = intValue.toLong()
    if (longValue is Long)
        println("Converted int to long explicitly")
    else
        println("Not converted")

    val doubleValue = intValue.toDouble()
    val charValue = intValue.toChar()
    val floatValue = intValue.toFloat()
    val stringValue = intValue.toString()
    println("Int $intValue in double is $doubleValue")
    println("Int $intValue in char is $charValue")
    println("Int $intValue in float is $floatValue")
    println("Int $intValue in string is $stringValue")

    val s = "Vedansh"
    println("$s in boolean is ${s.toBoolean()}")

    val boolean = true
    println("$boolean in String is ${boolean.toString()}")
    //---------------------------------------------------using AS keyword ->
    var booleanAsInt = boolean as? Int
    var intAsLong = intValue as? Long
    println(intAsLong)


    var v = 1.86F

    var int : Int= v.toInt()
    println(int)

    var char = 'a'
    var num : Int = Character.getNumericValue(char)
    println(char.code) //used to get ascii value of the char
    var numFromToInt : Int = char.toInt()
    println(num)
    println(numFromToInt)

}