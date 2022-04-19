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

    do{
    println(""" 1-> Check how many passed
        |2-> Get names of those who passed
        |3-> Get marks scaled to 100 of those who passed
        |4-> Check if all students have scored more than 40 
        |5-> Check if any student has scored a perfect 50
        |6-> Get the first roll number from start who failed
        |0-> to exit
    """.trimMargin())

    var choice = sc.nextInt()

        when(choice){
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
            4->{
                val allMoreThan40 = studentList.all { it.marks > 40  }
                if(allMoreThan40) println("All students have scored more than 40 marks ") else println("All could not score more than 40 marks")
                println()
            }
            5->{
                val any50 = studentList.any {it.marks == 50.0f }
                if(any50) println("Atleast one student scored a perfect 50") else println("Nobody could score 50 marks")
                println()
            }
            6->{
                val firstFail = studentList.find { it.marks < passingMarks }
                println("$firstFail failed the exam")
            }
            else->{
                if(choice != 0)
                println("Wrong input !")
            }
        }
    }while(choice != 0)


}