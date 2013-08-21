import scala.util.matching.Regex
import scala.math._

object Purse extends App{

	val currency = new Pound()
	
	def toDecimal(input: String) :Int = {
		def checkDecimalInputError(input: String, matcher: scala.util.matching.Regex) :Boolean = {
			if((matcher findFirstIn input) != None) true else false
		}

		//check for input errors
		if(checkDecimalInputError(input, currency.invalid_regexp)) return 0
		//remove decimal sign
		val noDecimal = currency.decimal_regexp replaceFirstIn(input, "")
		//return if we are an interger already
		if(isInt(noDecimal) != None) return noDecimal.toInt
		//else remove currency and convert to small values
		return stripCurrency(noDecimal)

	}
	
	
	def isInt(s: String) :Option[Int] = try {
	    Some(s.toInt)
	  } catch {
	    case _ : java.lang.NumberFormatException => None
	}
	
	def stripCurrency(s: String) :Int =  {
		//remove currency symbol	
		val n = currency.currency_regexp replaceFirstIn(s, "")
		println(n)

		if(isInt(n) != None) 
			return n.toInt * 100
		else
			return round(n.toFloat * 100)
	}
	
	require(args.size >= 1, "at minimum you should specify a value")
  	
	val input = args.head
	val decimal = toDecimal(input)
	println(decimal)
//	val coinSet	= toCoinSet(decimal)
	
}