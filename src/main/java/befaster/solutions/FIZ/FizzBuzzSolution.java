package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

    	String value = ""+ number;//return this no conditions meet
    	String intialValue = value;
    	  	
    	boolean isDeluxe = true;
    	boolean isFizz  = false;
    	boolean isBuzz = false;
    	
    	/*remove once happy with code
    	 * char[] split = value.toCharArray();
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
     	}*/
    	
    	if(intialValue.contains("3") && number % 3==0){
    		isDeluxe =true;
    	}
    	if(intialValue.contains("5")&& number % 5==0){
    		isDeluxe =true;
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
    	
    	//lets create the string based on the booleans
    	String finalValue = "";
    	
    	if(isFizz){
    		finalValue = "fizz";
    		if(isBuzz || isDeluxe) { //append the space
        		finalValue+=" ";   
        	}
    	}    	
    	if(isBuzz){
    		finalValue += "buzz";
    		if(isDeluxe) {
        		finalValue+=" ";  //append the space
        	}
    	}      	
    	if(isDeluxe){
    		//if its even do not append anything
    		if(number %2==0){
    			//do nothing
    		}else{
    			finalValue +="fake ";
    		}
    		finalValue += "deluxe";
    	}
    
    	if(finalValue.length() > 0){
    		return finalValue;
    	}
    	return intialValue;
    }

}




