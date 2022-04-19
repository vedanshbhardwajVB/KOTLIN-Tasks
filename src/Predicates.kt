import java.util.*

data class Student(val name : String, val rno : Int, val marks : Float)

fun main(){
    val sc = Scanner(System.`in`)
    var studentList = arrayListOf<Student>()
    println("How many student entries do you have ?")
    val n = sc.nextInt()
    println("Enter details in the format -> \"NAME ROLLNO MARKS\"")
    for(i in 1..n) {
        println("Student number $i details -")
        val name = sc.next()
        val rno = sc.nextInt()
        val marks = sc.nextFloat()

        studentList.add(Student(name, rno, marks))
    }

    println("Enter passing marks ..")
    val passingMarks = sc.nextInt()

    println(""" 1-> Check how many passed
        |2-> Get names of those who passed
        |3-> Get marks scaled to 100 of those who passed
    """.trimMargin())

    when(sc.nextInt()){
        1-> {
            val passCount = studentList.count{it.marks > passingMarks}
            println("$passCount number of students managed to pass out of ${studentList.size}")
        }
        2->{
            val markListOfPassed = studentList.filter { it.marks >= passingMarks }.map { it }
            markListOfPassed.forEach { print("$it |") }
            println()
        }
        3->{
            val markScaledListOfPassed = studentList.filter { it.marks >= passingMarks }.map { (it.marks/50) * 100  }
            markScaledListOfPassed.forEach { print("$it |") }
            println()
        }
    }

}