object PrimeCheck {
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

  def main(args: Array[String]): Unit = {
    val a = 5
    if (a>=1) {
      val isPrime = prime(a) // Check if a is prime
      if (isPrime)
        printf("%d is prime\n", a)
      else
        printf("%d is not prime\n", a)
    }else{
      println("Invalid input")
    }

  }
}