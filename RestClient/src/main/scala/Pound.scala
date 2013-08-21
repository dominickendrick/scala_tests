import scala.util.matching.Regex

class Pound {
	def currency_symbol = "£"
	def decimal_symbol = "p"
	def decimal_seperator = "."
	
	def currency_regexp = "^\u00A3|£".r
	def decimal_regexp  = "p$".r
	def invalid_regexp  = "[^p\u00A3\\.\\d£]".r
	
	def coins = List(200,100,50,20,10,5,2,1)
	def decimal_seperator_digits = 2
}