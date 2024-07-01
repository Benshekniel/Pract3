object StringFilter {
  def filterStrings(input: List[String]): List[String] = {
    input.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("hello", "world", "Scala", "programming", "language", "short")
    val filteredList = filterStrings(inputList)
    println(s"Input List: $inputList")
    println(s"Filtered List (strings with length > 5): $filteredList")
  }
}
