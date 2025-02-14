fun main(){
    val listOfnumbers = listOf(10, 5, 20, 15, 25, 30)
    val greaterThan = listOfnumbers.filter{it>15}
    println("Numbers greater than 15: $greaterThan")

    val ascendingOrder= greaterThan.sorted()
    print("Sorted numbers: $ascendingOrder")
}