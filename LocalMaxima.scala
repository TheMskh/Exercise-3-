object LocalMaxima {
  def findLocalMaxima(arr: Array[Int]): Unit = {
    val n = arr.length

    // First element
    if (n > 1 && arr(0) > arr(1)) {
      print(arr(0) + " ")
    }

    // Middle elements
    for (i <- 1 until n - 1) {
      if (arr(i) > arr(i - 1) && arr(i) > arr(i + 1)) {
        print(arr(i) + " ")
      }
    }

    // Last element
    if (n > 1 && arr(n - 1) > arr(n - 2)) {
      print(arr(n - 1))
    }
    println()
  }

  def main(args: Array[String]): Unit = {
    val arr = Array(2, 5, 7, 8, 4, 3, 5, 9, 4, 6, 8)
    findLocalMaxima(arr)
  }
}
