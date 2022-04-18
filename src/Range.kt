fun main(){
    var rangeOfNumbers = 1..10
        for(i in rangeOfNumbers)print("$i ")
    println()
    var rangeOfCharacters = 'a'..'z'
        for(i in rangeOfCharacters)print("$i ")
    println()
    var reverseRange = 'Z' downTo 'A'
        for(i in reverseRange)print("$i ")
    println()
    var reverseNumberRange = 50.downTo(1)
        for(i in reverseNumberRange)print("$i ")
    println()
    var uptoRange = 1 until 5
        for(i in uptoRange)print("$i ")
    println()
    var reversedRangeAgain = (1..10).reversed()
        for(i in reversedRangeAgain)print("$i ")
    println()
}