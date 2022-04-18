class Notebook constructor (var company : String, var price : Int=30){ // declaring var or val here only makes it a instance variable
    var pages: Int = 0                                                  // for other constructors we need to declare the instance variables here inside
    var ruled : Boolean = false

    init{
        println("Inside the constructor number 0 - the INIT block")
        println("$company notebook costs, Rs $price")
    }

    constructor( price: Int, company: String, p : Int)  : this(company, price){
        println("Inside the constructor number 1")
        this.pages=p
    }

    constructor(company: String, p : Int, ruled : Boolean) : this(company){
        println("Inside the constructor number 2")
        this.pages=p
        this.ruled = ruled
    }

    init {
        println("Inside the second init block, just for fun !!")
    }

    override fun toString(): String {
        return "Company : $company, Cost : $price, Pages : $pages, Ruled : $ruled"
    }
}