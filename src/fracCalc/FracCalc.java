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
		
		return secondOperand;
    }

    	String[] splitFraction (String input){
    		
    		{	int int1 = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("_")));
    			
    			
    			int num1= 
    		       Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_")+firstOperand.indexOf("/")));
    			int den1=
    			   Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
    			
    			int num2=
    			   Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("_")+secondOperand.indexOf("/")));
    			int den2=
    			   Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
    	
    	
    	}
    
    	
    	return ?
    					
    	//String[] splitFraction (String input)
    		//denominator=input
    	
    			//answer = {whole, numerator, denominator};
    
   // 	public int Numerator ;
    //	public int Denominator ;
    	
    //		int getNumerator() {
    //			return Numerator; 
    			
    //		}
    //	public void setNumerator(int Numerator){
    	//	this. Numerator = Numerator;
    	//}
    	
    //		int getDenominator(){
    	//	return Denominator ;
    	//}
    		
    //	public void setDenominator(int Denominator){
    	//	this.Denominator = Denominator;
    	//}
    	//public void display(){
    		//if (Numerator == 0 || Denominator == 1 ){
    			//System.out.print(Numerator);
    		//}
    		//else {
    			//if ((Numerator <0 && Denominator <0) || (Numerator >0 && Denominator <0)) {
    				//Numerator = -1;
    			//Denominator = -1;
    		//	}
    			//if (Numerator == Denominator){
    				//System.out.print("1");
    				//return 
    		//	}		
    //	public void splitFraction(String input){
    	//		Denominator=input.lastIndexOf("/");
    			
    		//	String[]answer={whole, Numerator, Denominator}
 //   	firstSplit = splitFraction(first Part);
	//	secondSplit = splitFraction(second Part) 
		//		return "whole:" +firstSplit[0]+"numerator" + firstSplit[1]+ "denominator" + firstSplit[2]
    		
    		//	gcd = denominator 1 * denominator 2
    			
    		//	top1 = numerator 1 * denominator 2 
    		//	top2 = numerator 2 * denomiator 1
    			
    			
    		}
    
