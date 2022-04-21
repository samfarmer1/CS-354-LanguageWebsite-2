class Account(val number: String, val customer: String, val balance: Double) {

    fun accrue(var rate: Double){}

    fun balance(): Double{
        return balance
    }
    fun deposit(var amount: Double){
        balance = balance + amount
    }

    fun withdraw(var amount: Double){
        balance = balance - amount
    }
    
    fun toString(): String{
        return number + " " + customer + " " + balance
    }
}