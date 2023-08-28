import scala.io.StdIn

object AverageFahrenheitTemperature {
  def main(args: Array[String]): Unit = {
    print("Input: ")
    val input = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]").split(",").map(_.trim.toDouble).toList

    val toFahrenheit = (x: Double) => (x*9/5)+32

    val sumAndCount = input.map(x => (toFahrenheit(x), 1)).reduce((a, b) => (a._1 + b._1, a._2 + b._2))
    print("Output: Average Fahrenheit temperature: "+ (sumAndCount._1/sumAndCount._2) )
//    print(sumAndCount)
  }
}

// Input: [0, 10, 20, 30]