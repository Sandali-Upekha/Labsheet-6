object Main {
  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map { c =>
      if (c.isLetter) {
        val base = if (c.isUpper) 'A' else 'a'
        val en = (c - base + shift) % 26
        (base + en).toChar
      }
      else {
        c
      }
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter text: ")
    val text = scala.io.StdIn.readLine()

    print("Enter shift key: ")
    val shift = scala.io.StdIn.readInt()

    print("Encrypted Text: " + encrypt(text, shift))
  }
}