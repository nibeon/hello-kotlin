// вторичные конструкторы
fun main(args: Array<String>) {
 
    val tom: Person = Person("Tom")
    val bob: Person = Person("Bob", 45)
     
    println("Name: ${tom.name}  Age: ${tom.age}")
    println("Name: ${bob.name}  Age: ${bob.age}")
}
 
class Person(_name: String){
    val name: String
    var age: Int = 0 // Возраст персоны 0 лет, если не указано другое
    init{
        name = _name
    }
    constructor(_name: String, _age: Int) : this(_name){
        age = _age
    }
}