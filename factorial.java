import java.util.*;
public class factorial
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the number:");
int a=sc.nextInt();
int fact=1;
int k=a;
while(a>=1)
{
fact=fact*a;
a--;
}
System.out.println("Factotial of"+k+"="+fact);
}
}


