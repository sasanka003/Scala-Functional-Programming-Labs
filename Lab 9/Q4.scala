class Account(val accNo: Int, var balance: Double) {
  require(accNo > 0, "Enter valid account number")

  def applyInterest(): Unit = {
    if (balance > 0) {
      // Positive balance, deposit interest
      balance *= 1.05
    } else if (balance < 0) {
      // Negative balance, overdraft interest
      balance *= 1.1
    }
  }

  override def toString: String = f"Account $accNo, Balance: $balance%.1f"
}

class Bank(val accounts: List[Account]) {

  def getAccountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.balance < 0)
  }

  def calculateTotalBalance: Double = {
    accounts.map(_.balance).sum
  }

  def applyInterestToAllAccounts(): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

object AccountActions {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1, 5000.0)
    val account2 = new Account(2, -200.0)
    val account3 = new Account(3, 100.0)

    val bank = new Bank(List(account1, account2, account3))

    println("Accounts with negative balances:")
    bank.getAccountsWithNegativeBalances.foreach(println)

    val totalBalance = bank.calculateTotalBalance
    println(s"Total balance of all accounts: $totalBalance")

    bank.applyInterestToAllAccounts()
    println("Balances after applying interest:")
    bank.accounts.foreach(println)
  }
}