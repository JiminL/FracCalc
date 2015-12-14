package fracCalc;

import java.util.*;
public class FracCalc {

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
        int int1 = 0, num1 = 0, den1 = 0, int2 = 0, num2 = 0, den2 = 0;
        
        for(int n=0; n<input.length(); n++)
        {
            String test = input.substring(n,n+1);
            if(test.equals(" ")&&operator.equals(""))
            {
                operator = input.substring(n+1,n+2);
                operator_position = n+1;
            }
        }
        
        String firstOperand = input.substring(0, input.indexOf(operator, input.indexOf("/")+1)-1);
        String secondOperand = input.substring(operator_position+2);
        
        if(firstOperand.indexOf("_")==-1&&firstOperand.indexOf("/")==-1)
        {
            int1 = Integer.parseInt(firstOperand);
            den1 = 1;
        }
        else if(firstOperand.indexOf("_")==-1&&firstOperand.indexOf("/")!=-1)
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
        
        if(operator.equals("+"))
        {
            int whole = int1+int2;
            if(num1==0 && num2==0)
            {
                return "Result: "+whole;
            }
            else
            {
                int num = 0, den = 0;
                if(num1==0 && num1!=0)
                {
                    num = num2;
                    den = den2;
                }
                else if(num1!=0 && num2==0)
                {
                    num = num1;
                    den = den1;
                }
                else
                {
                    num = num1*den2+num2*den1;
                    den = den1*den2;
                }
                int gcd = GCD(num, den);
                
                if(num>den)
                {
                    num = num-den;
                    whole++;
                }
                num = num/gcd;
                den = den/gcd;
                
                if(whole==0)
                {
                    return "Result: "+num+"/"+den;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
        }
        else if(operator.equals("-"))
        {
            int whole = int1-int2;
            if(num1==0 && num2==0)
            {
                return "Result: "+whole;
            }
            else
            {
                int num = 0, den = 0;
                if(num1==0 && num2!=0)
                {
                    num = num2;
                    den = den2;
                }
                else if(num1!=0 && num2==0)
                {
                    num = num1;
                    den = den1;
                }
                else if(num1==0 && num2==0)
                {
                    num = 0;
                }
                else
                {
                    num = num1*den2-num2*den1;
                    den = den1*den2;
                }
                int gcd = GCD(num, den);
                
                if(whole<0)
                {                
                    if(num<0)
                    {
                        num = num*-1;
                    }
                    else
                    {
                        num = den-num;
                        whole++;
                    }
                }
                else
                {
                    if(num<0)
                    {
                        num = den-num;
                        whole--;
                    }
                }
                num = num/gcd;
                den = den/gcd;
                
                if(whole==0)
                {
                    return "Result: "+num+"/"+den;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
        }
        else if(operator.equals("*"))
        {
            if(num1==0 && num2==0)
            {
                return "Result: "+(int1*int2);
            }
            else
            {
                int num = 0, den = 0;
                if(num1!=0 && num2==0)
                {
                    num1 = int1*den1+num1;
                    num = num1*int2;
                    den = den1;
                }
                else if(num1==0 && num2!=0)
                {
                    num2 = int2*den2+num2;
                    num = int1*num2;
                    den = den2;
                }
                else
                {
                    num1 = int1*den1+num1;
                    num2 = int2*den2+num2;
                    num = num1*num2;
                    den = den1*den2;
                }
                int gcd = GCD(num,den);
                int whole = 0;
                while(num>den)
                {
                    num = num-den;
                    whole++;
                }
                num = num/gcd;
                den = den/gcd;
                
                if(num==den)
                {
                    return "Result: "+whole;
                }
                else if(whole==0)
                {
                    return "Result: "+num+"/"+den;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
        }
        else
        {
            if(num1==0 && num2==0)
            {
                int gcd = GCD(int1,int2);
                int1 = int1/gcd;
                int2 = int2/gcd;
                
                return "Result: "+int1+"/"+int2;
            }
            else
            {
                int num = 0, den = 0;
                if(num1!=0 && num2==0)
                {
                    num1 = int1*den1+num1;
                    num = num1;
                    den = den1*int2;
                }
                else if(num1==0 && num2!=0)
                {
                    num2 = int2*den2+num2;
                    num = int1*den2;
                    den = den1*num2;
                }
                else
                {
                    if(int1!=0 && int2!=0)
                    {
                        num1 = int1*den1+num1;
                        num2 = int2*den2+num2;
                    }
                    else if(int1==0 && int2!=0)
                    {
                        num2 = int2*den2+num2;
                    }
                    else if(int1!=0 && int2==0)
                    {
                        num1 = int1*den1+num1;
                    }
                    num = num1*den2;
                    den = den1*num2;
                }
                int gcd = GCD(num,den);
                int whole = 0;
                while(num>den)
                {
                     num = num-den;
                     whole++;
                }
                num = num/gcd;
                den = den/gcd;
                
                if(whole==0)
                {
                    return "Result: "+num+"/"+den;
                }
                else if(num==den)
                {
                    return "Result: "+1;
                }
                else
                {
                    return "Result: "+whole+"_"+num+"/"+den;
                }
            }
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
}