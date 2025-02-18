fun main() {
    // We are calling a function, passing some data
    showMessage("Hello, World!")
    showSum(34, 67)

    // We are calling a function that returns a value
    getBestNumber()                     // The return value is lost
    val bestNumber = getBestNumber()    // The return value is stored for later use
    println("Best: ${getBestNumber()}") // The return value is used immediately

    // We are calling a function, passing data, and getting value back
    getSum(3,6)                         // The return value is lost
    val sum = getSum(3,6)               // Return value is stored
    println("3 + 6 = ${getSum(3,6)}")   // Use the return value immediately

    // We store multiple data items in MutableLists
    // We need to keep hold of a reference to the List
    // so we store in a variable
    val names = mutableListOf<String>()

    // We can then add / remove items
    names.add("Dave")
    names.add("Jimmy")
    names.add("Sally")
    names.add("Terry")
    names.add("Susan")
    names.add("Fenella")
    names.removeAt(1)
    names.remove("Dave")
    println(names[0])
    println()

    // Looping through lists...

    // Method 1: Use for loop
    for (name in names) {
        println(name)
    }
    println()

    // Method 2: Use indexes
    for (i in 0 ..< names.size) {
        println(names[i])
    }
    println()

    // This lets us label the items
    for (i in 0 ..< names.size) {
        println("$i : ${names[i]}")
    }
    println()

    // Modifying lists with functions

    // Method 1: pass the list as an argument
    addSomeNewNames(names)

    // Method 2: use the return value
    names.add(getNewName())

}

/**
 * This function takes 1 argument/parameter
 * It does not return a value
 */
fun showMessage(text: String) {
    // That data passed to this function is placed
    // into the local variable 'text'
    println(text)
}

/**
 * This function takes 2 arguments
 * It does not return a value
 */
fun showSum(num1: Int, num2: Int) {
    val sum = num1 + num2
    println("$num1 + $num2 = $sum")
}


/**
 * This function takes 0 arguments
 * It returns a value
 */
fun getBestNumber(): Int {
    // Pass back a value
    return 7
}

/**
 * This function takes 2 arguments
 * and returns a value
 */
fun getSum(num1: Int, num2: Int): Int {
    return num1 + num2
}


/**
 * Modify given list directly
 */
fun addSomeNewNames(names: MutableList<String>) {
    names.add("Beverley")
    names.add("Clive")
}

/**
 * Returning a value that will be used in a list
 */
fun getNewName(): String {
    return "Harry"
}
