// Write a java program to find the input character is vowel or consonent using swithch case
import java.util.*;
public class Switch
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any character:");
char k=sc.next().charAt(0);
switch(k)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("The character you entered is Vowel");
break;
default:
System.out.println("The character you entered is Consonant");
break;
}}}
