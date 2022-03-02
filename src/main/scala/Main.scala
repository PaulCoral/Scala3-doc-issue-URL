@main def hello: Unit = 
  println("Hello world!")
  println(~>~(1,2))

def msg = "I was compiled by Scala 3. :)"

class ~>~[A,B](_1: A, _2: B):
  override def toString: String = 
    s"${_1} ~>~ ${_2}"