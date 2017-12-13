// Возвращение функции из функции
fun main(args: Array<String>) {
 
    var action = selectAction(1)
    println(action(8,5))    // 13
 
    action = selectAction(2)
    println(action(8,5))    // 3
 
}
fun selectAction(key: Int): (Int, Int) -> Int{
    // определение возвращаемого результата
    when(key){
        1 -> return {x:Int, y: Int -> x + y}
        2 -> return {x:Int, y: Int -> x - y}
        3 -> return {x:Int, y: Int -> x * y}
        else -> return  {x:Int, y: Int -> 0}
    }
}