package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

    	String value = ""+ number;//return this no conditions meet
    	boolean isFizz  = false;
    	boolean isBuzz = false;
    	
    	
    	if(value.contains("3")){
    		value = "fizz";
    		isFizz = true;
    	}else if(number % 3 == 0){
    		value = "fizz";
    		isFizz = true;
    	}
    	if(value.contains("5")){
    		value = "buzz";
    		isFizz = true;
    	}else if(number % 5==0){
    		value= "buzz";
    		isBuzz = true;
    	}
    	  	
    	if(isFizz && isBuzz){
    		value= "fizz buzz";
    	}
    	
    	return value;
    }

}
