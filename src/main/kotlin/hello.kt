import kotlinx.cinterop.cValuesOf
import kotlinx.cinterop.cstr

fun main(args: Array<String>) {
    println("Hello from Kotlin/Native!")
    cgreeter.sayHelloInC("Josh".cstr)
}