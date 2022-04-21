import java.util.*;

class Bank(){

    var accounts: HashSet<Account> = hashSetOf<Account>()

    fun add(account: Account){
        accounts.add(account)
    }

    fun accrue(rate: Double){
        for (Account account in accounts){
            account.accrue(rate)
        }
    }

    fun toString(): String{
        var result = ""
        for (Account account in accounts){
            r += account.toString() + "\n"
        }
        return result
    }

    fun main(args: Array<String>){
        Bank bank = Bank()
        Customer customer = Customer("Ann")
        bank.add(CheckingAccount("01001", customer, 100.00))
        bank.add(SavingAccount("01002", customer, 200.00))
        bank.accrue(0.02)
        println(bank)
    }
}