interface Movable{
	fun move()
	fun stop(){
		println("Остановка")
	}
}

class Car : Movable{
	override fun move(){
		println("Машина едет")
	}
}
class Aircraft : Movable{
	override fun move(){
		println("Самолет летит")
	}
	override fun stop(){
		println("Приземление")
	}
}

fun main(args: Array<String>){
	val m1: Movable = Car()
	val m2: Movable = Aircraft()
	
	m1.move()
	m1.stop()
	m2.move()
	m2.stop()
}