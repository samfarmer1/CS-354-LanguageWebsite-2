import java.util.*;

class Bank(){

    var accounts: HashSet<Account> = hashSetOf<Account>()

    fun add(account: Account){
        accounts.add(account)
    }

    fun accrue(rate: Double){
        for (account in accounts) {
            account.accrue(rate)
        }
    }

    override fun toString(): String{
        var result = ""
        for (account in accounts){
            result += account.toString() + "\n"
        }
        return result
    }
}