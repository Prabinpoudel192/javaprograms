import java.util.*;
public class colour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the colour name: ");
        String k = sc.nextLine();
        String l = k.toUpperCase();

        if (l.equals("RED")) {
            System.out.println("Blood is red.");
        }
        else if(l.equals("WHITE"))
{
System.out.println("Cotton is White");}
else if(l.equals("BLUE"))
{
System.out.println("Sky is blue.");}
else if(l.equals("YELLOW"))
{
System.out.println("Turmaric is Yellow");}
else if(l.equals("PINK"))
{
System.out.println("Rose are pink.");}
else if(l.equals("BLACK"))
{
System.out.println("Buffalo are black");}
else if(l.equals("ORANGE"))
{
System.out.println("Pumpkins are orange.");}
         else {
            System.out.println("This colour is not in my knowledge.");
        }
    }
}

