package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

    	String value = ""+ number;//return this no conditions meet
    	String intialValue = value;
    	
    	boolean isDeluxe = false;
    	boolean isFizz  = false;
    	boolean isBuzz = false;
    	
    	//test delux first

    	char[] split = value.toCharArray();
    	if(split.length >0){
    		char previous;
        	for(int i=0; i <split.length; i++){
        		if(i!=0){
        			
        		}
        		previous = split[i];
        	}
    	}
    	
    	if(intialValue.contains("3")){
    		value = "fizz";
    		isFizz = true;
    	}else if(number % 3 == 0){
    		value = "fizz";
    		isFizz = true;
    	}
    	if(intialValue.contains("5")){
    		value = "buzz";
    		isBuzz = true;
    	}else if(number % 5==0){
    		value= "buzz";
    		isBuzz = true;
    	}
    	  	
    	if(isFizz && isBuzz && !isDeluxe){
    		value= "fizz buzz";
    	}
    	if(isFizz && isBuzz && isDeluxe){
    		value = "fizz buzz deluxe";
    	}
    	return value;
    }

}



