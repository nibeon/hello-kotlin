package account

fun transfer(from: Account, to: Account, sum: Int){
	if(from.sum >= sum){
		from.sum -= sum
		to.sum += sum
		println("Operation has been finished")
	}
	else{
		println("Invalid operation")
	}
}

class Account(var id: String, var sum: Int){
	fun displayInfo(){
		println("Account $id Sum: $sum")
	}	
}