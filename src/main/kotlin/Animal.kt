abstract class Animal(
    name: String
) {
    init {
        println("Animal $name is created")
    }

    abstract fun makeSound()
}