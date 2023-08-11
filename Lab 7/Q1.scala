import scala.io.StdIn

object EvenNumbers {
  def main(args: Array[String]): Unit = {
    print("Input: ")
    val input = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]").split(",").map(_.trim.toInt).toList

    val isEven = (x: Int) => x % 2 == 0
    val evenList = input.filter(isEven)

    print("Output: [")
    println(evenList.mkString(", ") + "]")
  }
}

// Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]