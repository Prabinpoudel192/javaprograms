import java.util.*;
public class Array
{
public static void main(String[] args)
{
for(int i=0;i<10;i++){
int[] num=new int[i]{};
}
for(int i=0;i<7;i++)
{
for(int j=0;j<6;j++)
{
if(num[j+1]<num[j])
{
int temp=num[j];
num[j]=num[j+1];
num[j+1]=temp;
}
else{}
}}
for(int i=0;i<7;i++)
{
System.out.println(num[i]);
}
}
}
