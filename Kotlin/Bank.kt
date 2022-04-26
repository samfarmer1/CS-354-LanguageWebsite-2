import java.util.*

class Bank(){

    var accounts = HashSet<Account>()

    fun add(account: Account){
        accounts.add(account)
    }

    fun accrue(rate: Double){
        for (account in accounts){
            account.accrue(rate)
        }
    }

    override fun toString(): String{
        var result = ""
        for ( account in accounts){
            result += account.toString() + "\n"
        }
        return result
    }

    fun main(args: Array<String>){
        val bank = Bank()
        val customer = Customer("Ann")
        bank.add(CheckingAccount("01001", customer, 100.00))
        bank.add(SavingAccount("01002", customer, 200.00))
        bank.accrue(0.02)
        println(bank)
    }
}