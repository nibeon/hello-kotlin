fun factorial(n: Int) : Int {
	var result = 1;
	for(d in 1..n){
		result *= d
	}
	return result
}

fun main(args: Array<String>){
	val a = factorial(4)
	val b = factorial(5)
	val c = factorial(6)
	println("a=$a b=$b c=$c")
}