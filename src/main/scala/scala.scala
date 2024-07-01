object StringReverser {
  def reverseString(input: String): String = {
    if (input.isEmpty) ""
    else reverseString(input.tail) + input.head
  }

  def main(args: Array[String]): Unit = {
    //val originalString = "hello"
    val originalString = scala.io.StdIn.readLine()
    val reversedString = reverseString(originalString)
    println(s"Original String: $originalString")
    println(s"Reversed String: $reversedString")
  }
}
