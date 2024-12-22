object module {
  def abs(n: Int): Int =
    if n < 0 then -n
    else n

  def factorial(n: Int): Int =
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if n <= 0 then acc
      else go(n - 1, n * acc)
    go(n, 1)

  def formatResult(name: String, n: Int, f: Int => Int) =
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))

  // Exercise 2.1
  def fib(n: Int): Int =
    @annotation.tailrec
    def go(n: Int, prev: Int, crr: Int): Int = {
      if n == 0 then prev
      else go(n - 1, crr, prev + crr)
    }
    go(n, 0, 1)

  // Exercise 2.2
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean =
    @annotation.tailrec
    def go(n: Int): Boolean =
      if n >= as.length - 1 then true
      else if ordered(as(n), as(n + 1)) then go(n + 1)
      else false
    go(0)

  def main(args: Array[String]): Unit = {}
}
