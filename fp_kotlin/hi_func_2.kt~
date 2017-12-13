// анонимные функции
fun main(args: Array<String>) {
 
    operation(9,5, fun(x: Int, y: Int): Int { return x + y })   // 14
    operation(9,5, fun(x: Int, y: Int): Int = x - y)            // 4
}
fun operation(x: Int, y: Int, op: (Int, Int) ->Int){
 
    val result = op(x, y)
    println(result)
}