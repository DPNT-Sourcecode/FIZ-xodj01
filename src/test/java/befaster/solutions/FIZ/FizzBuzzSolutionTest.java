package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {

	private FizzBuzzSolution solution;
	
	@Before
	public void setUp(){
		solution = new FizzBuzzSolution();
	}
	
	@Test
	public void testFizz(){
	 assertThat(solution.fizzBuzz(3), equalTo("fizz"));
	}
	@Test
	public void testFizzMultiple(){
	 //could potentially do this with an input file of multiple values divisible..
	 assertThat(solution.fizzBuzz(9), equalTo("fizz"));
	}
	@Test
	public void testBuzz(){
		 assertThat(solution.fizzBuzz(5), equalTo("buzz"));
	}

	@Test
	public void testBuzzMultiple(){
		 assertThat(solution.fizzBuzz(10), equalTo("buzz"));
	}	
	@Test
	public void testFizzBuzz(){
		 assertThat(solution.fizzBuzz(15), equalTo("fizz buzz"));
	}
	@Test
	public void testNoFizzNoBuzz(){
		 assertThat(solution.fizzBuzz(2), equalTo("2"));
	}
	@Test
	public void testHasFizzNumberInIt(){
		 assertThat(solution.fizzBuzz(23), equalTo("fizz"));	
	}
	@Test
	public void testHasTwoFizzNumberInIt(){
		 assertThat(solution.fizzBuzz(363), equalTo("fizz"));	
	}
	@Test
	public void testHasBuzzNumberInIt(){
		 assertThat(solution.fizzBuzz(52), equalTo("buzz"));	
	}
	@Test
	public void testHasTwoBuzzNumberInIt(){
		 assertThat(solution.fizzBuzz(505), equalTo("buzz"));	
	}
	
	@Test
	public void testHasFizzAndHasBuzzInSame(){
		 assertThat(solution.fizzBuzz(563), equalTo("fizz buzz"));		
	}
	
	@Test
	public void testAllDigitsTheSameOverTen(){
		 assertThat(solution.fizzBuzz(222), equalTo("deluxe"));
	}
	@Test
	public void testDeluxe(){
		 assertThat(solution.fizzBuzz(11), equalTo("deluxe"));		
	}
	@Test
	public void testFizzDeluxeTwo(){
		 assertThat(solution.fizzBuzz(222), equalTo("fizz deluxe"));		
	}
	@Test
	public void testFizzDeluxeSeven(){
		 assertThat(solution.fizzBuzz(777), equalTo("fizz deluxe"));		
	}
	@Test
	public void testBuzzDeluxe(){
		 assertThat(solution.fizzBuzz(555), equalTo("buzz deluxe"));		
	}
	
	@Test
	public void testDeluxeSeven(){
		 assertThat(solution.fizzBuzz(777), equalTo("fizz deluxe"));		
	}

	@Test
	public void testFizzBuzzDeluxe(){
		 assertThat(solution.fizzBuzz(555), equalTo("fizz buzz deluxe"));		
	}
}



