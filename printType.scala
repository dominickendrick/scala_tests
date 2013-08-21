def printType(obj:AnyRef) = obj match {
  case s: String => println("String")
  case l: List[_] => println("List")
  case a: Array[_] => println("Array")
  case _ => println("Skip to the fucking end")
}