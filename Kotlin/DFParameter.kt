fun greet(name: String, message: String = "Hello") {
    println("$message $name")
}

fun main() {
    greet("An", "Hi")
    greet(name = "An")
    greet(name = "An", message = "Hi")
    greet(message = "Hi", name = "An")
}

