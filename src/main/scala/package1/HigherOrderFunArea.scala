package package1

class HigherOrderFunArea {

  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String={
    shape match{
      case "rectangle"=> val rectArea =f(first,second)
        "Area of rectangle is"+rectArea

      case "rhombus"=> val rhombustArea =f(first,second)
        "Area of rhombus is"+rhombustArea


      case "parallelogram"=> val parallelogramArea =f(first,second)
        "Area of parallelogram is"+parallelogramArea

      case _ => "Not Found"


    }
  }
def rectArea(l: Int, b: Int):Int={
  l*b
}

  def rhombustArea(diagonal1:   Int,diagonal2: Int): Int={
    val area = diagonal1*diagonal2
    area/2
  }

  def parallelogramArea(base: Int, height: Int): Int={
    base*height
  }

}
