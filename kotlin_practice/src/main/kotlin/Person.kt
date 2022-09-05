class Person(
    name: String,
    var age: Int
) {
//    val name = name
//        get() = field.uppercase()

//    val uppercaseName: String
//        get() = this.name.uppercase()

    // set되는 순간 name 대문자로 설정
    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // custom getter
    val isAdult2: Boolean
        get() = this.age >= 20
}