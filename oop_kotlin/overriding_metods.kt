// переопределение методов

open class Person(val name: String){
    open fun display(){
        println("Name: $name")
    }
}
open class Employee(val company: String, name: String): Person(name){
 
    final override fun display() {
        println("Name: $name    Company: $company")
    }
}
class Manager(company: String, name: String):Employee(company, name){
    /* теперь функцию нельзя переопределить из-за final*/
    /*override fun display() {
        println("Name: $name Company: $company  Position: Manager")
    }*/
}

//  переопределение свойств
open class Person(val name: String){
 
    open val fullInfo: String
        get() = "Name: $name"
}
open class Employee(val company: String, name: String): Person(name){
 
    override val fullInfo: String
        get() = "Name: $name  Company: $company"
}

// Обращение к реализации из базового класса
open class Person(val name: String){
 
    open val fullInfo: String
        get() = "Name: $name"
 
    open fun display(){
        println("Name: $name")
    }
}
open class Employee(val company: String, name: String): Person(name){
 
    override val fullInfo: String
        get() = "${super.fullInfo} Company: $company"
 
    final override fun display() {
        super.display()
        println("Company: $company")
    }
}

// Правила переопределения
open class Video {
    open fun play() { println("Play video") }
}
 
interface AudioPlayable {
    fun play() { println("Play audio") }
}
 
class MediaPlayer() : Video(), AudioPlayable {
    // Функцию play обязательно надо переопределить
    override fun play() {
        super<Video>.play()         // вызываем Video.play()
        super<AudioPlayable>.play() // вызываем AudioPlayable.play()
    }
}