fun main(args: Array<String>) {
	val alice: Person = Person("Alice", 24)
	val kate = alice.copy(name = "Kate")
	println(alice.toString())
	println(kate.toString()) 
}

data class Person(val name: String, val age: Int)