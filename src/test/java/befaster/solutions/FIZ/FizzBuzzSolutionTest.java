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
	public void testFizzDivisible(){
	 //could potentially do this with an input file of multiple values divisible..
	 assertThat(solution.fizzBuzz(9), equalTo("fizz"));
	}
	
	@Test
	public void testBuzz(){
		 assertThat(solution.fizzBuzz(5), equalTo("buzz"));
	}
	@Test
	public void testFizzBuzz(){
		
	}
}

