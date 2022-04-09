fun main(){
    Calculations.sayHelloFromJava()
    val a = 20
    val b = 50
    println(Calculations.add(a, b))
}

fun sayHelloFromKotlin(){
    println("Hello JAVA file, I'm from KOTLIN")
}

fun subtract (a: Int, b : Int) : String {
    return "Kotlin file subtracting..... answer is ${a-b}"
}