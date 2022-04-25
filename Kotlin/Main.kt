fun main(args: Array<String>){
    val bank: Bank = Bank()
    val customer: Customer = Customer("Ann")
    bank.add(CheckingAccount("01001", customer, 100.00))
    bank.add(SavingAccount("01002", customer, 200.00))
    bank.accrue(0.02)
    println(bank)
}
