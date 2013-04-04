import scala.collection.mutable.Map

object pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(363); 

	
	
	def pascal(c:Integer, r:Integer):Integer = {
		def loop(row_ind:Integer, prev_row:List[Integer]):Integer = {
			if (row_ind < r) {
				val a = 0::prev_row
				val b = 0::prev_row
				
				val c = a.zip(b)
				val d : List[Integer] = c.map{ t:(Integer, Integer) => t._1 + t._2 }
				0
			}
			0
		}
		0
	};System.out.println("""pascal: (c: Integer, r: Integer)Integer""")}
}
