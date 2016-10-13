package is.ru.stringcalculator;

public class Calculator {
	
	public static int Add(String numbers) throws Exception{
		return getSum(getAllNumbers(numbers));
		
	}
		private static String[] getAllNumbers(String numbers){
			if(numbers.equals(""))
				return new String[0];
			else 
				return numbers.split(",|\n");
		}
		
		private static int getSum(String[] allNumbers) throws Exception{
			for(String number : allNumbers){
				if(toInt(number) < 0){
				  throw new IllegalArgumentException("Negatives not allowed: " + toInt(number));
				}
			}
			
			
			return NoNegNumbers(allNumbers);
				
		}
		
		private static int toInt(String numbers){
			return Integer.parseInt(numbers);
		}
	
		private static int NoNegNumbers(String[] allNumbers){
			int sum = 0;
			for(String number : allNumbers){
				if(toInt(number) <= 1000){
					sum += toInt(number);
				}	
		    }
			return sum;
		}

}