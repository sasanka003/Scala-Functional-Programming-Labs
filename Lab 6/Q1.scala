import scala.io.StdIn

object Caesar_cipher {
  def encrypt(s: String, i: Int): String = {
    val shift = i % 26
    var encrypted = ""

    for (char <- s) {
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a' //65 for 'A' else 97 for 'a'
        val temp = ((char - base + shift) % 26 + base).toChar
        encrypted += temp
      } else {
        encrypted += char
      }
    }

    encrypted
  }

  def decrypt(s: String, i: Int): String = {
    val shift = i % 26
    var decrypted = ""

    for (char <- s) {
      if (char.isLetter) {
        val base = if (char.isUpper) 'A' else 'a'
        val temp = ((char - base - shift + 26) % 26 + base).toChar
        decrypted += temp
      } else {
        decrypted += char
      }
    }

    decrypted
  }

  def cipher(s: String, shift: Int, func: (String, Int) => String): String = {
    func(s, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter e to encrypt or d to decrypt: ")
    val encryptOrDecrypt = scala.io.StdIn.readLine()
    if (encryptOrDecrypt == "e"){
      print("Enter phrase to encrypt: ")
      val str = scala.io.StdIn.readLine()

      print("Shift: ")
      val shift = scala.io.StdIn.readInt()
      if (shift < 0) {
        println("Invalid shift!")
        return
      }

      val encrypted_str = cipher(str, shift, encrypt)
      println(s"Encrypted: $encrypted_str")

    } else if (encryptOrDecrypt == "d"){
      print("Enter phrase to decrypt: ")
      val str = scala.io.StdIn.readLine()

      print("Shift: ")
      val shift = scala.io.StdIn.readInt()
      if (shift < 0) {
        println("Invalid shift!")
        return
      }

      val decrypted_str = cipher(str, shift, decrypt)
      println(s"Decrypted: $decrypted_str")

    } else {
      println("Enter valid command!")
      return
    }
  }
}