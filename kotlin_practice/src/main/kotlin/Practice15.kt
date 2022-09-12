fun main() {
    val array = arrayOf(100,200)

    for(i in array.indices){
        println("$i ${array[i]}")
    }
    array.plus(300)
    for((idx,value) in array.withIndex()){
        println("$idx $value")
    }

    val numbers = listOf(100,200)
    val numbers2 = mutableListOf(100,200)
    val emptyList = emptyList<Int>()
    printNumber(emptyList)

    for(number in numbers){
        println(number)
    }

    for((idx,value) in numbers.withIndex()){
        println("$idx $value")
    }

    mutableSetOf(100L)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for(key in oldMap.keys){
        println(key)
        println(oldMap[key])
    }

    for((key,value) in oldMap.entries){
        println("$key $value")
    }
}

private fun printNumber(numbers: List<Int>){

}