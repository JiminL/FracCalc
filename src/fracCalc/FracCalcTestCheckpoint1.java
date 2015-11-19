package fracCalc;

import java.util.Scanner;

import org.junit.Test;

// Checkpoint 1-only tests
public class FracCalcTestCheckpoint1
{
	public static void main(String[] args) 
    {
		public static String produceAnswer(String input)
		{
					
			for (int n=0; n<= input.length ; n++)
			{
				if (input.indexOf(n) == |+| && |-| && |*| && |/|)
				{
					String operator = input.substring((i.i+1));
					
				}
			}
			String firstOperand = input.substring(substring (0, input.indexOf(operator));
			String secondOperand = input.substring(input.indexOf(operator)+1);
			
			return secondOperand;
		}
		
		public static void main(String []args)
		{
			Scanner a = new Scanner(System.in);
			System.out.println("Input an arithmetic equation ); ");
			
			String A = a.nextLine;
			System.out.println(prodceAnswer(A));
			
		
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
   			
   			//*????? if (char == |+||-||*||/|) ????
   			//{ String operator;
   			//}
       

}
	

		
    private static int index(Object operator) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Test public void testCheckpoint1_1() {  FracCalcTestALL.assertForEarlyCheckpoints("6_5/8", "whole:6 numerator:5 denominator:8", "12_3/8", FracCalc.produceAnswer("5_3/4 + 6_5/8"));}
    @Test public void testCheckpoint1_2() {FracCalcTestALL.assertForEarlyCheckpoints("20", "whole:20 numerator:0 denominator:1", "-20_3/7", FracCalc.produceAnswer("-3/7 - 20"));}
    @Test public void testCheckpoint1_3() {FracCalcTestALL.assertForEarlyCheckpoints("27/21", "whole:0 numerator:27 denominator:21", "-33_2/7", FracCalc.produceAnswer("-32 - 27/21"));}
}
