/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author prabin
 */
class Circle {
    float radius;
    public Circle(float r){
        radius=r;
    }
    public void Area()
    {
       double area=(22/7)*radius*radius;
       System.out.println("The area is equal to "+area);
    }
    
}
public class Circle1{
    public static void main(String[] args){
        Circle s1=new Circle(5);
       s1.Area();
    }
}