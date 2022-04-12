import java.util.*

open class Profession(open var salary : Int, open var dressCode : String, open var workingHours : Int = 100){
    open fun isLegalProfession(){
        if(workingHours < 100)
            println("The profession is illegal")
        else
            println("The profession is legal")
    }
}

class Lawyer(override var salary: Int, override var dressCode: String) : Profession(salary, dressCode){
    fun showLawyerDetails() : String{
        return "I am a Lawyer. My salary : $salary, and I wear : $dressCode. I work for $workingHours hours !!"
    }

    override fun isLegalProfession() {  //only overridden by Lawyer Class
        super.isLegalProfession()
        println("-------------------------------------")
    }
}

class Engineer(override var salary: Int, override var dressCode: String) : Profession(salary, dressCode) {
    fun showEngineerDetails() : String{
        return "I am an Engineer. My salary : $salary, and I wear : $dressCode. I work for $workingHours hours !!"
    }
}

class Thief(override var salary: Int, override var dressCode: String, override var workingHours: Int) : Profession(salary,dressCode, workingHours){
    fun showThiefDetails() : String{
        return "I am a Lawyer. My salary : $salary, and I wear : $dressCode. I work for $workingHours hours !!"
    }
}

fun main (args : Array<String>){
    val sc = Scanner(System.`in`)
    println(""" 1 : Lawyer, 
        | 2 : Engineer, 
        | 3 : Thief
    """.trimMargin())

    when(sc.nextInt()) {
        1-> {
            println("Enter your salary..")
            val sal = sc.nextInt()
            println("Enter your dress code")
            val dressCode = sc.next()
            val lawyer = Lawyer(sal, dressCode)
            println(lawyer.showLawyerDetails())
            println(lawyer.isLegalProfession())
        }

        2-> {
            println("Enter your salary..")
            val sal = sc.nextInt()
            println("Enter your dress code")
            val dressCode = sc.next()
            val engineer = Engineer(sal, dressCode)
            println(engineer.showEngineerDetails())
            println(engineer.isLegalProfession())
        }

        3-> {
            println("Enter your salary..")
            val sal = sc.nextInt()
            println("Enter your dress code")
            val dressCode = sc.next()
            println("Enter your working hours ")
            val workingHours = sc.nextInt()
            val thief = Thief(sal, dressCode, workingHours)
            println(thief.showThiefDetails())
            println(thief.isLegalProfession())
        }

        else-> {
            println("Unexpected input")
        }
    }
}
