interface Printable{
    fun printName()
}
enum class DayTime: Printable{
    DAY{
        override fun printName(){
            println("День")
        }
    },
    NIGHT{
        override fun printName(){
            println("Ночь")
        }
    }
}
 
fun main(args: Array<String>) {
 
    DayTime.DAY.printName()     // День
    DayTime.NIGHT.printName()   // Ночь
}