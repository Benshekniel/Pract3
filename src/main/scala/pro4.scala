object EvenSumCalculator {
  def sumOfEvens(numbers: List[Int]): Int = {
    var sum = 0
    for (number <- numbers) {
      if (number % 2 == 0) {
        sum += number
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenSum = sumOfEvens(inputList)
    println(s"The sum of even numbers in the list $inputList is $evenSum")
  }
}

