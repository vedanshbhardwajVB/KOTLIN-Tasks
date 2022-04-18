fun main(){
    val arr = Array<Int>(4){1}
    arr[0]=2

    for(i in arr)
        println(i)

    println("____________________")
    println(arr[2])
    println(arr.get(2))
    arr.set(2, -1)
    println("Changed arr value at index 2")
    for(i in arr)
        println(i)
    println("Size of the array is ${arr.size}")

    val charArr = Array<Char>(2){ 'q'}
    charArr[0] = 'a'
    charArr[1] = 'z'
    for (i in charArr)
        println(i)

}