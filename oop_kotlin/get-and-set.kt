// использование и геттера, и сеттера
class Person{
    var name: String = "Tom"
    get(){
        return  field.toUpperCase()
    }
    set(value){
        if(value.length > 2)
            field = value
    }
 
    var age: Int = 18
    set(value){
        if((value > 0) and (value < 110))
            field = value
    }
 
    val info: String
        get() = "Name: $name  Age: $age"
}