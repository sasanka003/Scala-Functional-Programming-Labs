object NumberClassification {
  def classifyingNumbers(number: Int): String = number match
  {
    case number if number == 0 => "Zero"
    case number if number < 0 => "Negative"
    case number if number > 0 && number % 2 == 0 => "Even Number"
    case number if number > 0 && number % 2 == 1 => "Odd Number"
  }

  def main(args: Array[String]): Unit = {
    val number = -3
    print("The number is "+classifyingNumbers(number))

  }
}