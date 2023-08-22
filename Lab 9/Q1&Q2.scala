class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must not be zero")

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  def this(n: Int) = this(n, 1)  // Auxiliary constructor for whole numbers

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numerator, denominator)

  def sub(that: Rational): Rational = {
    val commonDenominator = this.denominator * that.denominator
    val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
    new Rational(newNumerator, commonDenominator)
  }

  override def toString: String = s"$numerator/$denominator"
}

object RationalOperations {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    val result = x.sub(y).sub(z)

    println(s"x - y - z = $result")

    val negX = x.neg
    println(negX)
  }
}