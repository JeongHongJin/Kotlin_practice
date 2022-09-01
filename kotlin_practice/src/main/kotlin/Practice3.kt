fun main() {
    val number1: Int = 3
    val number2: Long = number1?.toLong() ?: 0L

    val person = Person("정홍진",100)
    println("이름 : ${person.name}")

    val str = """
        ABC
        EFG
        ${person.name}
    """.trimIndent()

    val str2 = "ABC"
    println(str2[0])
    println(str2[1])

}

class Person {
    var name: String ?= null
    var age: Int ?= null

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }
}

fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        /*val person =  obj as Person
        println(person.age)*/
        println(obj.age)
    }
}

fun printAgeIfPerson2(obj: Any?){
    val person = obj as? Person
    println(person?.age)
}