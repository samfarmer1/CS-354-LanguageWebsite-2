public class SavingAccount (number: String, customer: Customer, balance: Double) : Account(number, customer, balance){

    private var interest: Double = 0.0;

    override fun accrue(rate: Double){
        interest += balance * rate;
        balance += balance * rate;
    }
}
