open class Vehicle {
    open fun startEngine() {
        println("Starting the engine of a generic vehicle.")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Starting the engine of a car. Ignition initiated.")
    }
}

fun Car.drift() {
    println("Performing a drift in the car!")
}

fun main() {
    val car = Car()
    car.startEngine()
    car.drift()
}
