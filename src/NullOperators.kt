class Name(val name : String?){
    fun checkUserNameCompatibility() {
        //finds the name compatible if the name is not null and is of size 2 at least, return true or false
        // safe call with let {} block

        name?.let {
            println("Inside .let block")
        } ?: run {
            println("Inside run block")
        }

    }

    fun checkNameAsAPasswordCompatibility() : Boolean {
        //finds the name compatible if the name length is at least 8
        //Can throw NUll pointer exception, the NOT NULL ASSERTION OPERATOR

        return name!!.length >= 8
    }
}

fun main() {
    println("Enter your name ")
    var name  = readLine()
//    var name : String? = null
    if (name?.length == null)
        println("Your name is null, code is still in the main() function !!")
    else
        println("Your name length is ${name.length} , already figured out in the main() method")
    var nameObj = Name(name)

    var realName = name ?: "NULL-NAME"
    println("The real name turns out to be $realName using the ELVIS (?:) operator")

    println(nameObj.checkUserNameCompatibility())
    //println(nameObj.checkNameAsAPasswordCompatibility())



}