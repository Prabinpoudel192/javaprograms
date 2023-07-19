import java.util.*;
public class Calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("What you want to do?");
System.out.println("1 for addition");
System.out.println("2 for subtraction");
System.out.println("3 for multiplication");
int k=sc.nextInt();
float l,m,n;
switch(k)
{
case 1:
System.out.println("Please enter the first number:");
l=sc.nextFloat();
System.out.println("please enter the second number:");
m=sc.nextFloat();
n=l+m;
System.out.println("The sum is equal to "+n);
break;

case 2:    
System.out.println("Please enter the first number:");
l=sc.nextFloat();
System.out.println("please enter the second number:");
m=sc.nextFloat();
n=l-m;
System.out.println("The difference is equal to "+n);
break;

case 3:    
System.out.println("Please enter the first number:");
l=sc.nextFloat();
System.out.println("please enter the second number:");
m=sc.nextFloat();
n=l*m;
System.out.println("The multiplication value is equal to "+n);
break;
}
}}
