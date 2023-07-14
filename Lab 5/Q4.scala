object OddOrEven {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = !(isEven(n))

  def main(args: Array[String]): Unit = {
    val a = 5
    if (a > 0)
      printf("%d is %s\n", a, if (isEven(a)) "even" else "odd")
    else
      printf("Invalid input\n")

  }
}