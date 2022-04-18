fun main (){
    var nb = Notebook("Classmate",  50, true)
    println(nb)
    println("________________________________________________________________")


    //use with to be able to use an Extension Function as a member function of a class
    with(Test()) {
        nb.addPages(250)
    }

    println("After adding pages through extension function")
    println(nb)
    println("________________________________________________________________")
    var nb1 = Notebook("Nova", 1000, true)
    println("Combined Pages in Notebook 1 and 2 -:> ${nb addP nb1}")
    println("________________________________________________________________")

    var concatenatedCompanyName = nb + nb1
    println("The combined company name of both notebooks is $concatenatedCompanyName")
    println("________________________________________________________________")

}

//Extension Function.....
class Test {
    fun Notebook.addPages(morePages : Int){
        this.pages+=morePages
    }
}

//Infix Function.......
//      -> Must be either a member or an extension function
//      -> Must have a single parameter, that too with no default values
infix fun Notebook.addP (n : Notebook) : Int{
    return this.pages + n.pages
}
//Operator Overloading.......
//      -> Must be either a member or an extension function
//      -> Must have a single parameter, that too with no default values
infix operator fun Notebook.plus (n : Notebook) : String {
    return this.company+n.company
}