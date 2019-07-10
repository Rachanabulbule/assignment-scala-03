
package package1

class HigherOrderFun {

  def sum(f: (Int, Int) => Int,a: Int, b:Int): Int={
    f(a,b)
  }

  def squareFunction(a: Int,b: Int):Int={
    a*a+b*b

  }

  def cubeFunction(a: Int,b: Int):Int={
    a*a*a+b*b*b
  }

    def intFunction(a: Int,b: Int):Int={
      a+b
    }

}
