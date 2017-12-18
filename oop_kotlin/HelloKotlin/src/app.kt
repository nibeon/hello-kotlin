import account.*

fun main(args: Array<String>) {
	val acc1 = Account("123456", 5500)
	val acc2 = Account("456778", 4000)
	
	transfer(acc1, acc2, 2500)
	acc1.displayInfo()
	acc2.displayInfo()
}