class Account (accNo: Int){
  require(accNo > 0 , "Enter valid account number")

  val balance: Double = if (balance == null || balance == 0.00) 0.00 else balance

  def getAccountNo: Int = accNo

  def getBalance: Double = balance

  def deposit(amount: Double): Double = {
    require(amount >= 0, "Invalid deposit amount")
    balance + amount
  }

  def withdraw(amount: Double): Double = {
    require(amount >= 0, "Invalid withdraw amount")
    balance - amount
  }

  def transfer(targetAccount: Account, transferAmount: Double): Boolean = {
    require(transferAmount >= 0, "Invalid transfer amount")
    require(balance >= transferAmount, "Insufficient balance")
    balance - transferAmount
    targetAccount.deposit(transferAmount)
    true
  }

}

object AccountActions {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1)
    val account2 = new Account(2)

    account1.deposit(5000.0)
    account2.deposit(500.0)
//    account1.transfer(account2,50.0)

    println(account1.getAccountNo)
    println(account1.getBalance)

    println(account2.getAccountNo)
    println(account2.getBalance)

  }
}