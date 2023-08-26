class Account(val accNo: Int, val balance: Double) {
  require(accNo > 0, "Enter valid account number")
  require(balance >= 0, "Balance must be non-negative")

  def deposit(amount: Double): Account = {
    require(amount >= 0, "Invalid deposit amount")
    new Account(accNo, balance + amount)
  }

  def withdraw(amount: Double): Option[Account] = {
    if (amount >= 0 && balance >= amount) {
      Some(new Account(accNo, balance - amount))
    } else {
      None // Insufficient balance or invalid withdrawal amount
    }
  }

  def transfer(targetAccount: Account, transferAmount: Double): Option[(Account, Account)] = {
    if (transferAmount >= 0 && balance >= transferAmount) {
      val updatedSourceAccount = new Account(accNo, balance - transferAmount)
      val updatedTargetAccount = new Account(targetAccount.accNo, targetAccount.balance + transferAmount)
      Some((updatedSourceAccount, updatedTargetAccount))
    } else {
      None // Insufficient balance or invalid transfer amount
    }
  }

  override def toString: String = s"Account $accNo, Balance: $balance"
}

object AccountActions {
  def main(args: Array[String]): Unit = {
    val account1 = new Account(1, 5000.0)
    val account2 = new Account(2, 500.0)

    val updatedAccount1 = account1.deposit(1000.0)
    println(s"Deposit successful: $updatedAccount1")

    account1.withdraw(2000.0) match {
      case Some(updatedAccount) =>
        println(s"Withdraw successful: $updatedAccount")
      case None =>
        println("Withdraw failed: Insufficient balance or invalid withdrawal amount")
    }

    account1.transfer(account2, 300.0) match {
      case Some((updatedSource, updatedTarget)) =>
        println(s"Transfer successful: $updatedSource -> $updatedTarget")
      case None =>
        println("Transfer failed: Insufficient balance or invalid transfer amount")
    }
  }
}