fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 == money3)
    
    if(money1 > money2){
        println("Money1이 Money2보다 크다")
    }
    
    // lazy 연산 fun1의 결과를 먼저 확인하고 결과 보여준다
    if(fun1() || fun2()){
        println("본문")
    }
}

class JavaMoney{
    val amount: Long
    constructor(amount: Long){
        this.amount = amount
    }
}

fun fun1(): Boolean{
    println("fun 1")
    return true
}

fun fun2(): Boolean{
    println("fun2")
    return false
}