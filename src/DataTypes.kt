fun main(){
    var number1 : Int
    var number2 : Short
    var number3 : Long
    var number4 : Double
    var isKotlinGood : Boolean
    var floatNumber  = 1


    isKotlinGood=false
    println("Kotlin is actually good. ${!isKotlinGood}")
    number1=123
    number2= 1234
    number3= 23456789121212
    number4 = 23.454

    val str = "Vedansh \n Bhardwaj"

    println("Int number plus 1 is ${number1.plus(1)}")
    println("Short number plus one is ${number2+1}")
    println("Long number's half value is ${number3.div(2)}")
    println("3 times the Double number is ${number4.times(2)}")
    for(i in str)
        println(i)

    val text = """
        This one is a raw string
        And it can have new lines 
              that too with any indent.
        It does not support escape characters like \n or \t
    """.trimIndent()

    println(text)

    val char : Char = 'e'
    println("The letter is $char ")

}