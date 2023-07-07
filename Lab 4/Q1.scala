object InterestCalculator {
  def interest(amount:Double):Double = amount match
  {
    case amount if amount <= 0 => amount * 0.0
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000  => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount if amount > 2000000 => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    val amount = 100000
    val interestPerAmount = interest(amount)
    println(f"The interest is: $interestPerAmount%.2f")
  }
}