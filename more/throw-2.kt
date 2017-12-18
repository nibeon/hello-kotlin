fun main(args: Array<String>) {
 
    val a: Int? = try { factorial(5) } catch (e: Exception) { null }
 
   println(a)
}
 
fun factorial(n: Int): Int{
    if(n < 1) throw  Exception("Input number must be more than zero")
    var result = 1
    for(i in 1..n)
        result *= i
    return result
}