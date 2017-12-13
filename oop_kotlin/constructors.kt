// простой конструктор класса
fun main(args: Array<String>) {
    val tom: Person = Person("Tom")
    val bob: Person = Person("Bob")
    val alice: Person = Person("Alice")
     
    println(tom.name)   // Tom
    println(bob.name)   // Bob
    println(alice.name) // Alice
}
 
class Person(_name: String){
    val name: String
    init{
        name = _name
    }
}