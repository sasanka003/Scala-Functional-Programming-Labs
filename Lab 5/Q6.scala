object Fibonacci {
  def fibonacciN(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacciN(n - 1) + fibonacciN(n - 2)
  }

  def fibonacciSeq(n: Int): Unit = n match {
    case 0 => printf("0 ")
    case _ => fibonacciSeq(n - 1); printf("%d ", fibonacciN(n))
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    if (n > 0) {
      printf("First %d fibonacci numbers with 0 : ", n)
      fibonacciSeq(n)
      printf("\n")
    }
    else
      printf("Invalid input\n")
  }
}