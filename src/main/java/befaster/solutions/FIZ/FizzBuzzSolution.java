package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

/**
 *  - If the number is a multiple of three then you should write "fizz"
  - If the number is a multiple of five then you should write "buzz"
  - If the number is a multiple of both three and five then you should write "fizz buzz"
  - If the number is not a multiple of five or three then write the number, example 1
 */
    	String value = ""+ number;//return this no conditions meet
    	boolean isFizz  = false;
    	boolean isBuzz = false;
    	if(number % 3 == 0){
    		value = "fizz";
    		isFizz = true;
    	}
    	if(number % 5==0){
    		value= "buzz";
    		isBuzz = true;
    	}
    	if(isFizz && isBuzz){
    		value= "fizz buzz";
    	}
    	return value;
    }

}

