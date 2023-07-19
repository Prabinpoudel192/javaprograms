import java.util.*;
public class Tempreture
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter what you want to convert?");
System.out.println("1 For Celsius to Fahrenheit");
System.out.println("2 For Fahrenheit to Celsius");
int k=sc.nextInt();
float l,m;

switch(k)
{
case 1:
System.out.println("Please enter the tempreture in celsius:");
l=sc.nextFloat();
m=(l*9/5)+32;
System.out.println("The fahrenheit is equal to "+m);
break;

case 2:
System.out.println("Please enter the tempreture in fahrenheit:");
l=sc.nextFloat();
m=(l-32)*5/9;
System.out.println("The fahrenheit is equal to "+m);
break;
}}}
