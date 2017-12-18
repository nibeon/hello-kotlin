fun main(args: Array<String>) {
	try {
		val x : Int = 0
		val z : Int = 0 / x
		println("z = $z")
	}
	catch(e: Exception){
		println("Exception!")
		println(e.message)
	}
	finally{
		println("Program has been finished")
	}
}