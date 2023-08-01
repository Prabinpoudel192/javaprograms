import java.util.*;
public class Possibleroot{
public static void main(String[] args){
Scanner kc=new Scanner(System.in);
System.out.println("Please enter the value of a,b and c:");
int a=kc.nextInt();
int b=kc.nextInt();
int c=kc.nextInt();
float k=(b*b)-(4*a*c);
if(k<0){
float sroot=(float)Math.sqrt((-1*k));
float real=(float)(-1*b)/(2*a);
float imaginary=(float)(sroot/(2*a));

System.out.println("The root1 is"+real+"+"+imaginary+"i");
System.out.println("The root2 is"+real+"-"+imaginary+"i");
}
else{
System.out.println("The root1 is"+((-b+k)/(2*a)));
System.out.println("The root2 is"+((-b-k)/(2*a)));
}
}}

