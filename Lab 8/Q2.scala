import scala.io.StdIn

object NumberClassification {
  val classifyingNumbers: Int => String = {
    case number if number == 0 => "Zero"
    case number if number < 0 => "Negative"
    case number if number > 0 && number % 2 == 0 => "an Even Number"
    case number if number > 0 && number % 2 == 1 => "an Odd Number"
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val number = scala.io.StdIn.readInt()
    print(f"$number is ${classifyingNumbers(number)}.")
  }
}