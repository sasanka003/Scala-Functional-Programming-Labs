import scala.io.StdIn

object LetterOccurrences {

  def countLetterOccurrences(input: List[String]) : Int = {
    input.map(x => x.length).reduce((a, b) => a + b)
  }

  def main(args: Array[String]): Unit = {
    print("Input: ")
    val input = scala.io.StdIn.readLine().stripPrefix("[").stripSuffix("]").split(",").map(_.trim.toString).map(_.stripPrefix("\"").stripSuffix("\"")).toList

    print("Output: Total count of letter occurrences: "+ countLetterOccurrences(input) )
  }
}

//Input: ["apple", "banana", "cherry", "date"]