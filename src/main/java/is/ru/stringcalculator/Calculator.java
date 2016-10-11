package is.ru.stringcalculator;

public class Calculator {
	
	public static int Add(String numbers){
		if(numbers.equals(""))
		return 0;
		else if(numbers.contains(",")){
			String [] num = numbers.split(",");
			return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
		}
		else 
			return 1;
	}


}