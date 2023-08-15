import scala.io.StdIn

object InterestCalculator {
  val interest: Double => Double = {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }

  def main(args: Array[String]): Unit = {
    print("Enter deposit amount : ")
    val amount = scala.io.StdIn.readDouble()
    if (amount < 0) {
      println("Invalid deposit amount.")
      return
    }
    val interestPerAmount = interest(amount)
    println(f"The interest is: $interestPerAmount%.2f")
  }
}