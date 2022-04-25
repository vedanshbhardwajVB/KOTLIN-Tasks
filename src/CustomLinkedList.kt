class CustomLinkedList<T> {
    var head : Node<T>?  = null
    var size : Int = 0

    fun add(data : T?){
        if(head == null){
            head = Node(data, null)
        }
        else{
            var temp = head
            while (temp?.next != null){
                temp=temp.next
            }
            temp?.next = Node(data, null)
        }
        this.size++
        println("Added the data $data as a new node  !!")
    }

    override fun toString(): String {
        if(head == null)
            return " null "
        var s = StringBuilder()
        var temp = this.head
        while(temp != null){
            s.append("${temp.data} -> ")
            temp=temp.next
        }
        return s.toString()
    }
}

class Node<T>(var data : T?, var next : Node<T>?)

fun main(){
    val ll = CustomLinkedList<Recharge>()
    ll.add(Recharge(1200, 1))
    ll.add(Recharge(1250, 12))
    ll.add(Recharge(12100, 11))

    println(ll)
    println("Size of the linked list is ${ll.size}")






}