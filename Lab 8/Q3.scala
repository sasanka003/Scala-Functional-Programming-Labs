import scala.io.StdIn

object StringFormatter {
  val toUpper: String => String = (str: String) => str.toUpperCase

  val toLower: String => String = (str: String) => str.toLowerCase

  def toUpperSpecific1(name: String): String = {

    val i: Int = 1
    if (i > name.length() - 1 || i < 0) {
      println("Index out of range")
      return name
    }
    name.substring(0, i) + name.substring(i, i + 1).toUpperCase() + name.substring(i + 1)
  }

  def toUpperSpecific3(name: String): String = {

    val i: Int = 5

    if (i > name.length() - 1 || i < 0) {
      println("Index out of range")
      return name
    }
    name.substring(0, i) + name.substring(i, i + 1).toUpperCase() + name.substring(i + 1)
  }

  def formatNames(name: String, formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    val upperCaseName = formatNames(names(0), toUpper)
    println(upperCaseName)

    val upperSpecificName1 = formatNames(names(1), toUpperSpecific1)
    println(upperSpecificName1)

    val lowerCaseName = formatNames(names(2), toLower)
    println(lowerCaseName)

    val upperSpecificName3 = formatNames(names(3), toUpperSpecific3)
    println(upperSpecificName3)


    println()
  }
}