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

}
