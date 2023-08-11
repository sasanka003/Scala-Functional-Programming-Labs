import scala.io.StdIn

object PrimeNumbers {
  def main(args: Array[String]): Unit = {
    print("Input: ")
    val input = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]").split(",").map(_.trim.toInt).toList

    val isPrime = (n: Int) => n > 1 && (2 until n).forall(x => n % x != 0)
    val primelist = input.filter(isPrime)

    print("Output: [")
    println(primelist.mkString(", ") + "]")
  }
}

// Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]