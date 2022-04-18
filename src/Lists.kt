fun main() {
    val `list is a list` = listOf<String>("One", "Two", "Three")
    `list is a list`.forEach{
        println(it)
    }

//    `list is a list`[0] = "nothing" gives error as list is immutable

    val  list = mutableListOf<String>("Four", "Five") // can use arrayListOf and ArrayList also
    list.add("Six")
    list.add(0, "Ten")

    println(list)


}