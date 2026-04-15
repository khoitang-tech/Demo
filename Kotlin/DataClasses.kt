data class Person(val name: String, val age: Int)

fun main() {
    val p1 = Person("An", 20)
    val p2 = Person("An", 20)

    println(p1)
    println(p1 == p2)
}
