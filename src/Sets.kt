fun main(){
    val set1 = setOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan") //not mutable, but ordered
    println(set1)

    val set2 = mutableSetOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan") //mutable and ordered
    set2.add("Arjun")
    println(set2)

    val set3 = hashSetOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan") //mutable and unordered
    set3.add("Arjun")
    println(set3)
}





