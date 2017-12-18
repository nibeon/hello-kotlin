abstract class Human(val name: String) {
	fun hello(){
		println("My name is $name")
	}
}
class Person(name: String): Human(name) // наследуем абстрактный класс

fun main(args: Array<String>) {
	val kate: Person = Person("Kate")
	val slim: Human = Person("Slim Shady")
	kate.hello()
	slim.hello()
}