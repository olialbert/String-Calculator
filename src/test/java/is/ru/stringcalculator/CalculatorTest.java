package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.Add(""));
	}
	
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.Add("1"));
	}
	


}