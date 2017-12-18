fun main(args: Array<String>) {
	Account().Transaction().pay(1200)
}
class Account{
	private var sum: Int = 3450
	fun display(){
		println("sum = $sum")
	}
	
	inner class Transaction{
		fun pay(s: Int){
			sum -= s
			display()
		}
	}
}