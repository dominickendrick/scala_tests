object Purse extends App{

	val currency = new Pound()
	
	def toDecimal(input: String) :Int = {

	//check for input errors
	if(checkDecimalInputError(input, currency.invalid_regexp)){
		return 0
	};
	
	return 1

	// //remove pence
	// input = input.replace(this.currency.decimal_regexp,"");
	// 
	// //check if we are an interger
	// if(this._isInt(input)){
	// 	return parseInt(input);
	// }
	// 
	// //parse pounds
	// input = this._stripCurrency(input);
	// 	
	// return parseInt(input);
	 }
	
	def checkDecimalInputError(input: String, regex: scala.util.matching.Regex) :Boolean = {
		return true
	}
	
}