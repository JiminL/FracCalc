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

    public static String produceAnswer(String input)
    { 
        // TODO: Implement this function to produce the solution to the input
    	
    	String operator = "";
    	int operator_position = 0;
    	int int1 = 0;
    	int num1 = 0;
    	int den1 = 1;
    	int int2 = 0;
    	int num2 = 0;
    	int den2 = 1;
       
    	//System.out.println(input);
    	//System.out.println(input.length());
    	
    	//System.out.println(input.substring(1));
    	
    	for (int n=0; n<input.length() ; n++)
		{
 //   		System.out.println("n = " + n);
//    		System.out.println(input.substring(n,n+1));
    		String test = input.substring(n,n +1);
			if (test.equals(" ") && operator.equals(""))
			
			{
				operator = input.substring(n+1, n+2);
				operator_position = n+1; 
			
				
	//		System.out.println(operator);
			}
		}
    	
		String firstOperand = input.substring(0, input.indexOf(operator));
		String secondOperand = input.substring(operator_position+2);
		
		//return secondOperand;
    
    	if(firstOperand.indexOf("_")==-1&&firstOperand.indexOf("/")==-1)
    	{
    		int1 = Integer.parseInt(firstOperand);
    		num1 = 0;
    		den1 = 1;
    	}
    	else if(firstOperand.indexOf("_")==-1&&firstOperand.indexOf("/")!=-1)
    	{
    		int1 = 0;
    		num1 = Integer.parseInt(firstOperand.substring(0, firstOperand.indexOf("/")));
    		den1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
    	}
    	else
    	{
    		int1 = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("_")));
    		num1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_")+1, firstOperand.indexOf("/")));
    		den1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
    	}

    	if(secondOperand.indexOf("_")==-1&&secondOperand.indexOf("/")==-1)
    	{
    		int2 = Integer.parseInt(secondOperand);
    		num2 = 0;
    		den2 = 1;
    	}
    	else if(secondOperand.indexOf("_")==-1&&secondOperand.indexOf("/")!=-1)
    	{
    		int2 = 0;
    		num2 = Integer.parseInt(secondOperand.substring(0, secondOperand.indexOf("/")));
    		den2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
    	}	
    	else
    	{
    		int2 = Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("_")));
    		num2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("_")+1, secondOperand.indexOf("/")));
    		den2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
    	}

   
    	String result = "";
    	result += "In \"SecondOperand\"";
    	result += "\n\tWhole number: "+ int2;
    	result += "\n\tNumerator: "+ num2;
    	result += "\n\tDenominator: "+ den2;
    
    	return result;
	}
}
    	
    
    			
    		
    
