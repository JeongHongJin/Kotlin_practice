fun main() {

}

class JavaHouse(
    private val address: String,
    private val livingRoom: LivingRoom,
){
    class LivingRoom(
        private val area: Double
    )
}

class JavaHouse2(
    private val address: String,
    private val livingRoom: LivingRoom,
){
    inner class LivingRoom(
        private val area: Double
    ){
        val address: String
            get() = this@JavaHouse2.address
    }
}