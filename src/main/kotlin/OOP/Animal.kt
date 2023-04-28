package OOP

open class Animal(color:String, legs:Int) {

    init {
        println("Color is $color")
        println("number of legs is $legs")
    }
}
class Dog() : Animal {


    fun woof() {
        println("The Dog Barks")
    }
}