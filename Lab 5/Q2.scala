object PrimeSequence {
  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case b if b > a => gcd(b, a)
    case _ => gcd(b, a % b)
  }

  def prime(a: Int, b: Int = 2): Boolean = b match {
    case x if x == a => true
    case x if gcd(a, x) > 1 => false
    case x => prime(a, x + 1)
  }

  def primeSeq(a: Int): Unit = a match {
    case x if x > 1 => primeSeq(x - 1); if (prime(x)) printf("%d ", x)
    case _ =>
  }

  def main(args: Array[String]): Unit = {
    val a = 20
    if (a>1) {
      printf("Prime numbers upto %d : ", a)
      primeSeq(a-1)
    }else{
      println("Invalid input")
    }
  }
}