public class Rotate{
public static void main(String[] args){
int[] arr={1,2,3,4,5,6,7,8,9,10};
int[] rot=new int[arr.length];
int i;
int j=0;
int k=3;
System.out.println("The array before right rotation.");
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
for(i=0;i<arr.length;i++)
{
if((i+k)<arr.length)
{
rot[(i+k)]=arr[i];
}
else{
rot[j]=arr[i];
j++;
}}
System.out.println("The rotated value will be displayed below.");
for(i=0;i<arr.length;i++)
{
System.out.print(rot[i]+" ");
}


}}