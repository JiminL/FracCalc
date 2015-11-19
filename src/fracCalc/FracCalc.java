package fracCalc;

import java.util.Scanner;

public class FracCalc {

//	public String produceAnswer(String input)
//	{
//			
//			for (int n=0; n<= input.length() ; n++)
//			{
//				if (input.indexOf(n) = "+" || "-" || "*" || "/")
//				
//				{
//					String operator = input.substring((n, n+1));
//					
//				}
//			}
//			String firstOperand = input.substring(substring (0, input.indexOf(operator));
//			String secondOperand = input.substring(input.indexOf(operator)+1);
//			
//			return secondOperand;
//		}
		
		public static void main(String []args)
		{
			Scanner a = new Scanner(System.in);
			System.out.println("Input an arithmetic equation ); ");
			
			String A = a.nextLine();
			System.out.println(produceAnswer(A));
			
		
		}
		//Scanner a = new Scanner (System.in);
		
		//System.out.print("input an equation: ");
		//String produceAnswer = a.nextLine();
		
   		
			//String firstOperand = 
   				//	produceAnswer.substring(0, index(operator));
   			
			//String secondOperand = 
					//produceAnswer.substring(index(operator), produceAnswer.length());
			
   			//String operator = 
   				//	produceAnswer.index();
   			
  
    	
        // TODO: Read the input from the user and call produceAnswer with an equation
//    	System.out.print(produceAnswer());
//    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	
    	String operator = "";
       
    	for (int n=0; n<= input.length() ; n++)
		{
    		String test = input.substring(n,1);
			if (test == "+" || test == "-" || test == "*" || test == "/")
			
			{
				operator = input.substring(n, n+1);
				
			}
		}
    	
		String firstOperand = input.substring(0, input.indexOf(operator));
		String secondOperand = input.substring(input.indexOf(operator)+1);
		
		return secondOperand;
    }
    
}
