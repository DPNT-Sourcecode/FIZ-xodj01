package befaster.solutions.SUM;


public class SumSolution {

    public int compute(int x, int y) throws InvalidNumberException {

    	if(x < 0 || x > 100){
    		throw new InvalidNumberException();
    	}
    	if(y < 0 || y > 100){
    		throw new InvalidNumberException();
    	}
    	//we can assume becaues of the parmams in we'll get ints.. not not strings, or handle above
        //expected a number between 0 and 100
    	//implement as an exception if not between the values or do this where the arguments come in..
           
    	
        //if we get here we've done well
        return x + y;
    }

}
