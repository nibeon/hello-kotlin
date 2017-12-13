class Person{
    var name: String = "Tom"
     
    var age: Int = 18
    set(value){
        if((value>0) and (value <110)) // данные изменяются только при соблюдении условия
            field = value
    }
 
    val info: String
        get() = "Name: $name  Age: $age"
}

fun main(args: Array<String>) {
 
    val bob: Person = Person()
    bob.name = "Bob"
    bob.age = 25        // вызываем сеттер
 
    println(bob.info)   // Name: Bob    Age: 25
    bob.age = -8        // вызываем сеттер
    println(bob.info)   // Name: Bob    Age: 25
}