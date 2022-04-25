open class Account(var number: String, var customer: Customer, var balance: Double) {

    open fun accrue(rate: Double){}

    fun balance(): Double{
        return balance
    }
    fun deposit(amount: Double){
        this.balance = balance + amount
    }

    fun withdraw(amount: Double){
        this.balance = balance - amount
    }
    
    override fun toString(): String{
        return "$number $customer $balance"
    }
}