class Person{
    var name: String = "Tom"
    var age: Int = 18
 
    val info: String
        get() = "Name: $name  Age: $age"
}

fun main(args: Array<String>) {
 
    val bob: Person = Person()
    bob.name = "Bob"
    bob.age = 25
 
    println(bob.info)   // Name: Bob    Age: 25
    // bob.info = "qwerty" // так нельзя - свойство info неизменяемое
}