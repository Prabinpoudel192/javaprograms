import java.util.*;
public class Binary
{
public static void main(String[] args)
{
int i=0,reminder=0;
int[] sum=new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("Please enter the first binary number:");
long k=sc.nextLong();
System.out.println("Please enter the second binary number:");
long l=sc.nextLong();

while(k!=0 || l!=0)
{
sum[i++]=(int)((k%10+l%10+reminder)%2);
reminder=(int)((k%10+l%10+reminder)/2);
k=k/10;
l=l/10;
}
if(reminder!=0){
sum[i++]=reminder;
}
i--;
System.out.println("The sum is equal to :");
while(i>=0)
{
System.out.print(sum[i--]);
}
System.out.println();
}}