class Person(val name: String, val age: Int){
	fun sayHello(){
		println("Hello")
	}
	fun go(location: String){
		println("$name goes to $location")
	}
	fun getInfo() : String{
		return "Name: $name Age: $age"
	}
}

fun main(args: Array<String>) {
	val bob: Person = Person("Bob", 23)
	
	bob.sayHello()
	bob.go("the shop")
	bob.go("the cinema")
	
	println(bob.getInfo())
}