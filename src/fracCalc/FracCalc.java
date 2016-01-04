package fracCalc;

import java.util.*;
public class FracCalc
{
    public static void main(String []args)
    {
        Scanner a = new Scanner(System.in);
        System.out.println("Input an arithmetic equation: ");
        String A = a.nextLine();
        while(!A.equalsIgnoreCase("quit"))
        {
            System.out.println(produceAnswer(A));
            System.out.println("Input another equation: ");
            A = a.nextLine();
        }
        System.out.println("Thank you.");
    }
    
    public static String produceAnswer(String input)
    {
        String operator = "";
        int operator_position = 0;
        int int1 = 0, num1 = 0, den1 = 1, int2 = 0, num2 = 0, den2 = 1;
        
        for(int n=0; n<input.length(); n++)
        {
            String test = input.substring(n,n+1);
            if(test.equals(" ")&&operator.equals(""))
            {
                operator = input.substring(n+1,n+2);
                operator_position = n+1;
            }
        }
        
        String firstOperand = "";
        String secondOperand = "";
        if(operator!="")
        {
            firstOperand = input.substring(0, input.indexOf(operator, operator_position-2)-1);
            secondOperand = input.substring(operator_position+2);
        }
        else
        {
            firstOperand = input;
        }
        
        
        if(firstOperand.indexOf("_")==-1 && firstOperand.indexOf("/")==-1)
        {
            int1 = Integer.parseInt(firstOperand);
            den1 = 1;
        }
        else if(firstOperand.indexOf("_")==-1 && firstOperand.indexOf("/")!=-1)
        {
            num1 = Integer.parseInt(firstOperand.substring(0, firstOperand.indexOf("/")));
            den1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
        }
        else
        {
           int1 = Integer.parseInt(firstOperand.substring(0,firstOperand.indexOf("_")));
           num1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("_")+1, firstOperand.indexOf("/")));
           den1 = Integer.parseInt(firstOperand.substring(firstOperand.indexOf("/")+1));
        }
        
        if(secondOperand!="")
        {
            if(secondOperand.indexOf("_")==-1&&secondOperand.indexOf("/")==-1)
            {
                int2 = Integer.parseInt(secondOperand);
                den2 = 1;
            }
            else if(secondOperand.indexOf("_")==-1&&secondOperand.indexOf("/")!=-1)
            {
                num2 = Integer.parseInt(secondOperand.substring(0, secondOperand.indexOf("/")));
                den2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
            }
            else
            {
                int2 = Integer.parseInt(secondOperand.substring(0,secondOperand.indexOf("_")));
                num2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("_")+1, secondOperand.indexOf("/")));
                den2 = Integer.parseInt(secondOperand.substring(secondOperand.indexOf("/")+1));
            }
        }
        else
        {
            int2 = 0;
            num2 = 0;
            den2 = 0;
        }
        
        num1 = getNum(int1, num1, den1);
        num2 = getNum(int2, num2, den2);
        int whole = 0, num = 0, den = 0;
        
        if(operator.equals("+"))
        {            
            if(den1!=1 && den2!=1)
            {
                num = num1*den2+num2*den1;
                den = den1*den2;
            }
            else if(den1==1 && den2!=1)
            {
                num = num1*den2+num2;
                den = den2;
            }
            else if(den1!=1 && den2==1)
            {
                num = num1+num2*den2;
                den = den1;
            }
            else
            {
                num = num1+num2;
                den = 1;
            }
            
            return result(whole, num, den);
        }
        else if(operator.equals("-"))
        {
            if(den1!=1 && den2!=1)
            {
                num = num1*den2-num2*den1;
                den = den1*den2;
            }
            else if(den1==1 && den2!=1)
            {
                num = num1*den2-num2;
                den = den2;
            }
            else if(den1!=1 && den2==1)
            {
                num = num1-num2*den1;
                den = den1;
            }
            else
            {
                den = 1;
            }
           
            return result(whole, num, den);
        }
        else if(operator.equals("*"))
        {
            num = num1*num2;
            if(den1!=1 && den2!=1)
            {
                den = den1*den2;
            }
            else if(den1==1 && den2!=1)
            {
                den = den2;
            }
            else if(den1!=1 && den2==1)
            {
                den = den1;
            }
            else
            {
                den = 1;
            }
            
            return result(whole, num, den);
        }
        else if(operator.equals("/"))
        {
            if(num2>0)
            {
                if(den1!=1 && den2!=1)
                {
                    num = num1*den2;
                    den = den1*num2;
                }
                else if(den1==1 && den2!=1)
                {
                    num = num1*den2;
                    den = den2*num1;
                }
                else if(den1!=1 && den2==1)
                {
                    num = num1;
                    den = den1*num2;
                }
                else
                {
                    num = num1;
                    den = num2;
                }
            }
            else
            {
                if(den1!=1 && den2!=1)
                {
                    num = -num1*den2;
                    den = den1*-num2;
                }
                else if(den1==1 && den2!=1)
                {
                    num = -num1*den2;
                    den = den2*-num2;
                }
                else
                {
                    num = -num1;
                    den = -num2;
                }
            }
            
            return result(whole, num, den);
        }
        else if(operator.equals(""))
        {
            return result(int1, num1, den1);
        }
        else
        {
            return "0";
        }
    }
    
    public static int GCD(int a, int b) 
    {
        if (b == 0)
        {
            return a;
        }
        return GCD(b, a % b);
    }
    
    public static int getNum(int whole, int num, int den)
    {
        if(num==0)
        {
            return whole;
        }
        else
        {
            if(whole<0)
            {
                return -(-whole*den+num);
            }
            else
            {
                return whole*den+num;
            }
        }
    }
    
    public static String result(int whole, int num, int den)
    {
        if(num==0)
        {
            return "Result: "+0;
        }
        else
        {
            int gcd = GCD(num, den);
            if(gcd<0)
            {
                gcd = -gcd;
            }
            num = num/gcd;
            den = den/gcd;
            if(num<0)
            {
              num = -num;
              while(num>=den)
              {
                  num = num-den;
                  whole--;
              }
            }
            else
            {
                while(num>=den)
                  {
                   num = num-den;
                  whole++;
                }
            }
           
            if(num==den && -num==den)
            {
                return "Result: "+whole;
            }
            else if(whole==0)
            {
                if(num==0)
                {
                    return "Result: "+0;
                }
                else
                {
                    return "Result: "+num+"/"+den;
                }
            }
            else if(whole<0)
            {
                if(num==0)
                {
                    return "Result: "+whole;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
            else
            {
                if(num==0)
                {
                    return "Result: "+whole;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
        }
    }
}