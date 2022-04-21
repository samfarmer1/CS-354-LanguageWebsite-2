public class SavingAccount (number: String, customer: Customer, balance: Double) : Account(number, customer, balance){

    private var interest: Double = 0.0;

    fun SavingAccount(number: String, customer: Customer, balance: Double){
        this.number = number;
        this.customer = customer;
        this.balance = balance;
    }

    fun accrue(rate: Double){
        interest += balance * rate;
        balance += balance * rate;
    }
}