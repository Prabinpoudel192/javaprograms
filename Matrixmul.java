//Write a java program to find the multiplication of two 3X3 matrix and display the resultant matrix
import java.util.*;
public class Matrixmul
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int [][]a=new int[3][3];
int [][]b=new int[3][3];
int [][]c=new int[3][3];
for (int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.printf("Please enter the element of matrix A for the position %d%d: ", i + 1, j + 1);
a[i][j]=sc.nextInt();

}}
for (int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{

System.out.printf("Please enter the element of matrix B for the position  %d%d: ", i + 1, j + 1);
b[i][j]=sc.nextInt();

}}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
c[i][j]=0;
for(int k=0;k<3;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}}}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}
}
