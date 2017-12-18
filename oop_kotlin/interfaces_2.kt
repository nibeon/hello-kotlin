interface Movable{
    fun move()      // определение функции без реализации
    fun stop(){     // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}

interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}

class Car(mod: String, num: String) : Movable, Info{
 
    override val number: String
    override val model: String
    init{
        number = num
        model = mod
    }
    override fun move(){
        println("Машина едит")
    }
}

fun main(args: Array<String>) {
 
    val m1: Car = Car("Tesla", "2345SDG")
    println(m1.model)
    println(m1.number)
 
    m1.move()
    m1.stop()
}