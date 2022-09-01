fun main() {

    val list = listOf("kotlin", "is", "fun")
    val count = list.count { x ->
        x.length < 4
    }
    println(count)
//    val num = readLine() ?: "0"
//    val parsedNum = try {
//        num.toInt()
//    } catch (e: NumberFormatException) {
//        println("Invalid user input: $num")
//        0
//    }
//    println(parsedNum)

//     val bear =  object :  Animal("bear") {
//        override fun makeSound() {
//            println("roar!!!")
//            TODO("Not yet implemented")
//        }
//    }
//    val dog = Dog()
//    dog.makeSound()
//
//    val cat = Cat()
//    cat.makeSound()

//    val userIn = readLine()?: "0"
//    val userIn2 = readLine()?: "0"
//    val result = userIn.toInt() + userIn2.toInt()
//
//    val shoppingList = mutableListOf("Eggs", "Milk", "Bread", "Apples")
//    shoppingList.add("Bananas")

//    for (i in 0 until shoppingList.size) {
//        println(shoppingList[i])
//    }

//    val x = 3
//    when (x) {
//        in 1..2 -> println("x == 1")
//        in 3..10 -> println("x == 3")
//        else -> {
//            println("x is neither 1 nor 2")
//        }
//    }

//    print10Num(2)
//    if(even(num = 67)) println("even")
//    else println("odd")
//
//    println(6.isOdd())
    val c = list.customCount { x ->
        x.length < 4
    }

}

fun <T> List<T>.customCount(fn: (T)-> Boolean): Int {
    var count = 0
    for (item in this) if (fn(item)) count++
    return count
}

fun Int.isOdd(): Boolean {
    return this % 2 != 0
}

fun even(num: Int = 10): Boolean { //default value
    return num % 2 == 0
}

fun print10Num(x: Int) {
    for (i in 1..10) {
        println(i + x)
    }
}