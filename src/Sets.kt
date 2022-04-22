fun main(){
    val set1 = setOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan") //not mutable, but ordered
    println(set1)

    val set2 = mutableSetOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan", "Ajay") //mutable and ordered
    set2.add("Arjun")
    println(set2)

    val set3 = hashSetOf<String>("Naman", "Ayush", "Vedansh", "Vedansh", "Ayush", "Pavan") //mutable and unordered
    set3.add("Arjun")
    println(set3)

    //functions are almost all the same as in list.....
    //there are a few Set specific functions -> Union Intersect

    println("___________________________________")
    println(set2 union  set3)
    println(set1 intersect  set2 )

    //if applied on lists these functions will still return sets only
    val l1 = listOf(1, 2, 3,4 ,5 )
    val l2 = listOf(1, 4, 9, 16, 25)

    val unionDemoONList = l1 union  l2
    println(unionDemoONList)
    println(l1 intersect  l2)
}





