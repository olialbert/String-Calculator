package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testEmptyString() throws Exception {
		assertEquals(0, Calculator.Add(""));
	}
	
	@Test
	public void testOneNumber() throws Exception{
		assertEquals(1, Calculator.Add("1"));
	}
	
	@Test
	public void testTwoNumber() throws Exception{
		assertEquals(3, Calculator.Add("1,2"));
	}
	
	@Test
	public void testUnknownNumber() throws Exception {
		assertEquals(6, Calculator.Add("1,2,3"));
	}
	
	@Test
	public void testNewLineDilimitedNumber() throws Exception   {
		assertEquals(6, Calculator.Add("1\n2,3"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void negativeNumberWillThrowException() throws Exception{
		Calculator.Add("-1");
		Calculator.Add("2, -4, 3, -5");
	}
	
	@Test
	public void NumGreaterThan1000AreIgnored() throws Exception {
		assertEquals(20, Calculator.Add("10,10,1010"));
	}
	
	@Test
	public void DifferentDelimiter() throws Exception {
		assertEquals(8, Calculator.Add("//;\n4;4"));
	}
}	