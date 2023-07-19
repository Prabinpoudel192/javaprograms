import java.util.*;
public class calculator
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1 for addition");
System.out.println("2 for subtraction");
System.out.println("3 for multiplication");
System.out.println("4 for division");
System.out.println("5 to exit");
int k=sc.nextInt();
switch (k)
{
case 1:
{
System.out.println("Please enter the first value:");
float l=sc.nextFloat();
System.out.println("Please enter the second value:");
float m=sc.nextFloat();
float  n=l+m;
System.out.println("Sum of these two numbers is "+n);
break;
}
case 2:
{
System.out.println("Please enter the first value:");
float l=sc.nextFloat();
System.out.println("Please enter the second value:");
float m=sc.nextFloat();
float n=l-m;
System.out.println("Difference value of these two numbers is "+n);
break;
}
case 3:
{
System.out.println("Please enter the first value:");
float l=sc.nextFloat();
System.out.println("Please enter the second value:");
float m=sc.nextFloat();
float n=l*m;
System.out.println("Multiplication of these two numbers is "+n);
break;
}
case 4:
{
System.out.println("Please enter the first value:");
float l=sc.nextFloat();
System.out.println("Please enter the second value:");
float m=sc.nextFloat();
float n=l/m;
System.out.println("Divison of these two numbers is "+n);
break;
}
case 5:
{
System.exit(0);
break;
}
}
}
}







