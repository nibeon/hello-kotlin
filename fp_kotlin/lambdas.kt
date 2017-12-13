fun main(args: Array<String>) {
	val printer = {message: String -> println(message)}
	printer("Hello")
	printer("Good bye")
}