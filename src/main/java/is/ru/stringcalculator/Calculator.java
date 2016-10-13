package is.ru.stringcalculator;

public class Calculator {
	private static String delimiters = (",|\n");
	public static int Add(String numbers) throws Exception{
		return getSum(splitNumbers(numbers));
		
	}
		private static String[] splitNumbers(String numbers){
			if(numbers.equals(""))
				return new String[0];
			else if(numbers.contains("//")){
				String[] split = numbers.split("\n");
				delimiters = split[0].substring(2);
				return split[1].split(delimiters);
			}
				return numbers.split(delimiters);
		}
		
		private static int getSum(String[] allNumbers) throws Exception{
			NoNegNumbers(allNumbers);
			return NoNumBiggerThan1000(allNumbers);		
		}
		
		private static int toInt(String numbers){
			return Integer.parseInt(numbers);
		}
	
		private static int NoNumBiggerThan1000(String[] allNumbers){
			int sum = 0;
			for(String number : allNumbers){
				if(toInt(number) <= 1000){
					sum += toInt(number);
				}	
		    }
			return sum;
		}
		
		private static void NoNegNumbers(String[] allNumbers){
			for(String number : allNumbers){
				if(toInt(number) < 0){
				  throw new IllegalArgumentException("Negatives not allowed: " + toInt(number));
				}
			}
		}
		

}