var name : String?  = "Tom"
val firstName: String = name ?: "Undefined" // если name = null, то присваивается "Undefined"
 
var age: Int? = 23
val myAge: Int = age ?:0    // если age равно null, то присваивается число 0



//переменная дутпер олучает либо null, либо длину строки
val name : String?  = "Tom"
val length: Int? = name?.length



// если операнд равен null, то генерируется исключение
val name : String?  = "Tom"
val id: String = name!!
println(id)