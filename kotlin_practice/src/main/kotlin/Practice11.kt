private val a =3

fun add(a: Int, b: Int): Int{
    return a +b
}

class Test private constructor(){

}

fun isDirectoryPath(path: String): Boolean{
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
){
    var price = _price
}