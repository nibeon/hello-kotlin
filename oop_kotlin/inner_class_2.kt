fun main(args: Array<String>) {
	Account().Transaction(1200).pay()
}
class Account{
	private var sum: Int = 3450
	fun display(){
		println("sum = $sum")
	}
	
	inner class Transaction(s: Int){
		private var sum : Int = 0
		init {
			this.sum = s
		}
		fun pay(){
			this@Account.sum -= this@Transaction.sum
			display()
		}
	}
}