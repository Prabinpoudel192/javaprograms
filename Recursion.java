/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author prabin
 */
import java.util.*;
public class Recursion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the nth term:");
        int k=sc.nextInt();
        System.out.println("The values will be displayed below: ");
        Count(k);
        System.out.println(" ");
    }
    public static void Count(int k){
        if (k>=0){
            Count(k-1);
         System.out.print(Recursion1(k)+" ");
        }
    }
    public static int Recursion1(int count)
    {
        if(count==0 || count==1)
        {
            return count;
        }
        else {
            return(Recursion1(count-1)+Recursion1(count-2));
        }
    }
}
