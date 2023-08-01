import java.util.*;
public class Fibo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the nth term:");
int k=sc.nextInt();
long[] fibo=new long[k];
for(int i=0;i<k;i++)
{
if(i<=1)
{
System.out.print(1+" ");
fibo[i]=1;
}
else{
fibo[i]=fibo[(i-1)]+fibo[(i-2)];
System.out.print(fibo[i]+" ");
}}
System.out.println();
}}