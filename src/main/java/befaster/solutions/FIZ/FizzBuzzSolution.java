package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

    	String value = ""+ number;//return this no conditions meet
    	String intialValue = value;
    	  	
    	boolean isDeluxe = true;
    	boolean isFizz  = false;
    	boolean isBuzz = false;
    	
    	char[] split = value.toCharArray();
    	if(split.length >0 && number > 10){
    		char previous = 'a';//it will never be an a
        	for(int i=0; i <split.length; i++){
        		if(i!=0){
        			if(split[i]!=previous){
        				isDeluxe =false;
        				break;
        			}
        		}
        		previous = split[i];
        	}
    	}else{
    		isDeluxe= false;
    	}
    	
    	if(intialValue.contains("3")){	
    		isFizz = true;
    	}else if(number % 3 == 0){
    		isFizz = true;
    	}
    	if(intialValue.contains("5")){
    		isBuzz = true;
    	}else if(number % 5==0){
    		isBuzz = true;
    	} 	
    	
    	String finalValue = "";

    	if(isFizz){
    		finalValue = "fizz";
    		if(isBuzz || isDeluxe) {
        		finalValue+=" ";   
        	}
    	}    	
    	if(isBuzz){
    		finalValue += "buzz";
    		if(isDeluxe) {
        		finalValue+=" ";   
        	}
    	}      	
    	if(isDeluxe){
    		value+="deluxe";
    	}
    	
    	if(finalValue != intialValue){
    		return finalValue;
    	}
    	return intialValue;
    }

}





