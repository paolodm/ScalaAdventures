
object hw1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(363); 

  def calc(remaining: List[Char], acc:Integer): Integer =
    if (remaining.length > 0) {
      def first = remaining(0)
      def left = remaining.slice(1, remaining.length)
      
      if (acc < 0) acc
      else if (first == '(') calc(left, acc + 1)
      else if (first == ')') calc(left, acc - 1)
      else calc(left, acc)
    }
    else acc;System.out.println("""calc: (remaining: List[Char], acc: Integer)Integer""");$skip(71); 
      
  def balance(chars: List[Char]): Boolean = calc(chars, 0) == 0;System.out.println("""balance: (chars: List[Char])Boolean""");$skip(50); val res$0 = 
  
  balance("(if (zero? x) max (/ 1 x))".toList);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(85); val res$1 = 
  balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(24); val res$2 = 
  balance(":-)".toList);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(25); val res$3 = 
  balance("())(".toList);System.out.println("""res3: Boolean = """ + $show(res$3))}
}
