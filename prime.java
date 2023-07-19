//Java program to find the entered number is prime or composite
import java.util.*;
public class prime
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Please enter the number:");
int k=sc.nextInt();

if(k==1)
{
System.out.println("1 is neither prime nor composite");
}
else
{
int i,num,count=0;
for(i=1;i<=k;i++)
{
num=k%i;

if(num==0)
{
count++;
}
else{}
}
if(count==2)
{
System.out.println("The number you entered is prime");
}
else
{
System.out.println("The number you entered is Composite");
}}
}
}
