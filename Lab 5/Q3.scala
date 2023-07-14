object SumN {
  def add(n: Int): Int = n match {
    case 0 => 0
    case _ => n + add(n - 1)
  }

  def main(args: Array[String]): Unit = {
    val a = 5
    if (a > 0)
      printf("Sum of numbers from 1 to %d : %d\n", a, add(a))
    else
      printf("Invalid input\n")
  }
}