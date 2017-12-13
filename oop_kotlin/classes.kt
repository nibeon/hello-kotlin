fun main(args: Array<String>){
	val bob: Person = Person()
	println(bob.name) // Tom
	println(bob.age) // 18
	
	// изменяем имя и возраст
	bob.name = "Bob"
	bob.age = 25
	
	println(bob.name) // Bob
	println(bob.age) // 25
}

class Person{
	var name: String = "Tom"
	var age: Int = 18
}