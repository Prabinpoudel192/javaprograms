import java.util.*;
public class Rectangle
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the length and breadth of rectangle:");
float l=sc.nextFloat();
float b=sc.nextFloat();

float area=l*b;
float peremeter=2*(l+b);
System.out.println("The area is "+area+" and peremeter is "+peremeter);
}}
