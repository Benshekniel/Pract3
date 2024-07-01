object ArithmeticMean {
  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2
    mean
  }

  def main(args: Array[String]): Unit = {
    val num1 = 7
    val num2 = 4
    val mean = calculateMean(num1, num2)
    println(f"The arithmetic mean of $num1 and $num2 is $mean%.2f")
  }
}

