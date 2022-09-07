fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object : Movable{
        override fun move() {
            println("무브")
        }

        override fun fly() {
            println("날다")
        }
    })
}

class Person2 private constructor(
    var name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person2 {
            return Person2(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable){
    movable.move()
    movable.fly()
}