open class Account(val number: String, val customer: Customer, var balance: Double) {

    open fun accrue(rate: Double){}

    fun balance(): Double{
        return balance
    }
    fun deposit(amount: Double){
        balance += amount
    }

    fun withdraw(amount: Double){
        balance -= amount
    }
    
    override fun toString(): String{
        return "$number $customer $balance"
    }
}