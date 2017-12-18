// оператор is для проверки на принадлежность данных определенному типу

fun main(args: Array<String>) {
 
    square(5)
}
 
fun square(d: Any){
    //val t = d * d   // недопустимая операция - d - не число, а объект типа Any
    if(d is Int)
        println(d * d)  // норм, d уже представляет тип Int
    else
        println("d is not an Int")
}