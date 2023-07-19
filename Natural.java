//Write a java program to calculate sum of first n natural number
import java.util.*;

public class Natural
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Please enter the upper limit:");
int k=sc.nextInt();
int i, sum=0;
for(i=1;i<=k;i++)
{
sum=sum+i;
}
System.out.println("The sum of all natural numbers upto"+k+"="+sum);
}
}
