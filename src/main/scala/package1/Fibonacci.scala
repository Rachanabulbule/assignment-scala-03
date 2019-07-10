package package1

class Fibonacci {

  def printFibonacci(n: Int): Int ={
    def calfab(n: Int, pre: Int, curr: Int): Int={
      if(n==0)
        pre
      else {
        println(pre)
        calfab(n - 1, curr, curr + pre)
      }
    }
    calfab(n,0,1)
  }

}
