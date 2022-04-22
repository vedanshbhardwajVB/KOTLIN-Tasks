data class StudentDetail (val name : String, val rno : Int)
fun main(){
    val map = mapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three")
    // map.put() error as map is immutable
    println(map)

    val differentMap = mutableMapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three") // mutable and ordered map(LinkedHashMap implementation)
    differentMap.put(1, "Won")
    differentMap.put(6, "Six")
    println(differentMap)

    val unorderedMap = hashMapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three") // mutable and unordered map(HashMap implementation)
    unorderedMap[2] = "Too"
    unorderedMap.put(4, "Four")
    unorderedMap.put(5, "Five")

    for(key in unorderedMap.keys)
        println(unorderedMap[key])
    println(unorderedMap)

    var st1 = StudentDetail("Akshay Kumar", 1)
    var st2 = StudentDetail("Shahid Kapoor", 2)
    var st3 = StudentDetail("Manoj Bajpayee", 3)
    var st4 = StudentDetail("Pankaj Tripathi", 4)
    var st5 = StudentDetail("Nawazuddin", 5)

    val studentMap = hashMapOf<StudentDetail, Int>(st1 to 80, st2 to 35, st3 to 75, st4 to 89, st5 to 90)
    println(studentMap.keys)
    println(studentMap.values)

    val filteredStudents = studentMap.filter { (key, value) -> key.name.endsWith("r") && value >= 50 }
    // also have filterKeys() and filterValues() which only check on the keys or values
    println(filteredStudents)

    //getting a value
    val stCustom = StudentDetail("Vedansh", 40)
    println(studentMap.getOrElse(stCustom) {
        println("Generating default value ")
        33
    })

    //removing failed students from map
    studentMap.values.remove(35)
    println(studentMap)

}
