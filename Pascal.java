//Write a java program to print pascal triangle
import java.util.*;
public class Pascal
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Please enter the row of triangle:");
int k=sc.nextInt();
int i,j,l;

for(i=1;i<=k;i++)
{
for(j=5-i;j>=0;j--)
{
System.out.print(" ");
}
for(l=1;l<=(2*i)-1;l++)
{
System.out.print("*");
}
System.out.println();
}}
}
