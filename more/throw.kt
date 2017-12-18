fun main(args: Array<String>) {
 
   try{
       println(factorial(-5))
   }
   catch(e: Exception){
       println(e.message)
   }
}
 
fun factorial(n: Int): Int{
    if(n < 1) throw  Exception("Input number must be more than zero")
    var result = 1
    for(i in 1..n)
        result *= i
    return result
}