fun main(args: Array<String>) {
 
    val alice: Person = Person("Alice")
    val kate: Employee = Employee("Kate", "Google")
    val liza: Person = Employee("Liza", "Apple")
}
 
open class Person(val name: String)
class Employee: Person{
 
    var company: String="undefined"
 
    constructor(name: String, comp:String) : super(name){
        company = comp
    }
}