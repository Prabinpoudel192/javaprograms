/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author prabin
 */
class Rectangle {
    double length;
    double breadth;
    public Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    public double Area(){
        return length*breadth;
        
    }
    public double Perimeter(){
        return 2*(length+breadth);
    }
    
}
public class Rectangle2{
    public static void main(String[] args){
        Rectangle r1=new Rectangle(12.33d,8.564d);
        Rectangle r2=new Rectangle(56.852d,33.56441d);
        System.out.println("The area and perimeter of Rectangle 1 is "+r1.Area()+","+r1.Perimeter());
        System.out.println("The area and perimeter of Rectangle 2 is "+r2.Area()+","+r2.Perimeter());
    }
}
