// функции высшего порядка. передача лямбда-выражения в функцию
fun main(args: Array<String>) {
	val add = {x:Int, y: Int -> x+y}
	val multiply = {x: Int, y: Int -> x*y}
	
	action(5, 3, add)
	action(5, 3, multiply)
	action(5, 3, {x: Int, y: Int -> x - y})
}

fun action(n1: Int, n2: Int, operation: (Int, Int)->Int){
	val result = operation(n1, n2)
	println(result)
}