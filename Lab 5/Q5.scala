object EvenSum {
  def addEven(n: Int): Int = n match {
    case 0 => 0
    case _ => if (n % 2 == 0) n + addEven(n - 1) else addEven(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val a = 10
    if (a > 0)
      printf("Sum of even numbers less than %d : %d\n", a, addEven(a-1))
    else
      printf("Invalid input\n")
  }
}