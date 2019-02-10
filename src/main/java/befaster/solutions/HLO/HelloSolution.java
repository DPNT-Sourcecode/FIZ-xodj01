package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
       if(friendName !=null){
    	   return "Hello " + friendName;
       }
       else if(friendName.length() ==0){
    	  //can we change the system to ask this question?
    	  return "Hello, i do not know your name.";    	  
      }else{
    	  return "Hello "+ friendName;
      }
      
    }
}

