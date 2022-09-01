package practice

fun main() {
    var number1 = 10L

    val number2 = 5L

    val person = Person("사람")
}

class Person {
    var name: String ?= null

    constructor(name: String){
        this.name = name
    }
}