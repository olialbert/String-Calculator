package is.ru.stringcalculator;

public class Calculator {
	
	public static int Add(String numbers){
		return getSum(getAllNumbers(numbers));
		
	}
		private static String[] getAllNumbers(String numbers){
			if(numbers.equals(""))
				return new String[0];
			else 
				return numbers.split(",|\n");
		}
		
		private static int getSum(String[] allNumbers){
			int sum = 0;
			for(String number : allNumbers)
				sum += toInt(number);
			return sum;
		}
		
		private static int toInt(String numbers){
			return Integer.parseInt(numbers);
		}
	


}