object decrypt {

    def decrypt(ciphertext: String, shift: Int): String = {
      ciphertext.map { c =>
        if (c.isLetter) {
          val base = if (c.isUpper) 'A' else 'a'
          val de = (c - base - shift + 26) % 26
          (base + de).toChar
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

      print(s"Decrypted Text: " + decrypt(text, shift))
    }
}

