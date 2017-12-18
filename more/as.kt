//as - явное приведение к типу

fun main(args: Array<String>) {
 
    square(5)
}
 
fun square(d: Any){
    val t = d as Int    // приводим к типу Int
    println(t * t)
}