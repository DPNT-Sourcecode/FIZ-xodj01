package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
	public String hello(String friendName) {

		if(friendName !=null){
			if(friendName.length() ==0){
				//can we change the system to ask this question?
				return "Hello, i do not know your name.";    	  
			}else{
				return "Hello, " + friendName + "!";
			}
		}
		//should we return nothing? should we return a blank?
		return "Hello, i do not know your name.";    
	}
}
