fun main() {

}

data class PersonDto(
    val name: String,
    val age: Int,
)

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

sealed class HCar(
    val name: String,
    val price: Long
)

class Avante : HCar("아반떼", 1_000L)

class Sonata : HCar("소나타", 2_000L)

class Grandeur : HCar("그렌져", 3_000L)
