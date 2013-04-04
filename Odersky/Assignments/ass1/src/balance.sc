
object balance {

  def calc(remaining: List[Char], acc:Integer): Integer =
    if (remaining.length > 0) {
      def first = remaining(0)
      def left = remaining.slice(1, remaining.length)
      
      if (acc < 0) acc
      else if (first == '(') calc(left, acc + 1)
      else if (first == ')') calc(left, acc - 1)
      else calc(left, acc)
    }
    else acc                                      //> calc: (remaining: List[Char], acc: Integer)Integer
      
  def balance(chars: List[Char]): Boolean = calc(chars, 0) == 0
                                                  //> balance: (chars: List[Char])Boolean
  
  balance("(if (zero? x) max (/ 1 x))".toList)    //> res0: Boolean = true
  balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList)
                                                  //> res1: Boolean = true
  balance(":-)".toList)                           //> res2: Boolean = false
  balance("())(".toList)                          //> res3: Boolean = false
}