object ArithmeticMean {
  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = 20
    val mean = calculateMean(num1, num2)
    println(f"The arithmetic mean of $num1 and $num2 is $mean%.2f")
  }
}

//object ArithmeticMean {
//  def calculateMean(num1: Int, num2: Int): Double = {
//    val mean = (num1 + num2) / 2.0
//    math.round(mean * 100.0) / 100.0
//  }
//
//  def main(args: Array[String]): Unit = {
//    val num1 = 10
//    val num2 = 20
//    val mean = calculateMean(num1, num2)
//    println(f"The arithmetic mean of $num1 and $num2 is $mean%.2f")
//  }
//}

