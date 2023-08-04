/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author prabin
 */
class Rectangle1 {
    float length;
    float breadth;
    public Rectangle1(float l,float b){
       length=l;
       breadth=b;
    
}
   public void Area(){
       float area=length*breadth;
       System.out.println("The area is equal to "+area);
   } 
   public void Perimeter(){
       float perimeter=(2*(length*breadth));
       System.out.println("The peremeter is equal to "+perimeter);
   }
}
public class Rectangle{
    public static void main(String[] args){
        Rectangle1 s1=new Rectangle1(12.32f,7.5f);
        Rectangle1 s2=new Rectangle1(10.5f,5.3f);
        s1.Area();
        s1.Perimeter();
         s2.Area();
        s2.Perimeter();
    }
}