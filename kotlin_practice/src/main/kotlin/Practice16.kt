fun main() {
    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    // this는 수신객체
    // 확장 타입 = 수신 객체 타입
    return this[this.length - 1]
}

//지역 함수 예시

/*
fun createPerson(firstName: String, lastName: String): Person{
    fun validateName(name: String, fieldName: String){
        if(name.isEmpty()){
            throw IllegalArgumentException("${fieldName}은 비어 있을 수 없습니다. 현재값 : $name")
        }
    }
    validateName(firstName,"firstName")
    validateName(lastName,"lastName")
    return Person(firstName,lastName,1)
}*/
