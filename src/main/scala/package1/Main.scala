package package1
import package1._

object Main extends App {

val f = new Fibonacci
println(f.printFibonacci(5))

  val obj = new HigherOrderFun
  println(obj.sum(obj.squareFunction,2,3))

  val higherobj = new HigherOrderFunArea
  println(higherobj.area("circle",3,2,higherobj.rectArea))
}
