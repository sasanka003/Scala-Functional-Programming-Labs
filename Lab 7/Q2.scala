import scala.io.StdIn

object SquareOfNumbers {
  def main(args: Array[String]): Unit = {
    print("Input: ")
    val input = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]").split(",").map(_.trim.toInt).toList

    val square = (x: Int) => x * x
    val squarelist = input.map(square)

    print("Output: [")
    println(squarelist.mkString(", ") + "]")
  }
}

// Input: [1, 2, 3, 4, 5]