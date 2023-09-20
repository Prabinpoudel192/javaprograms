import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class decToBin implements ActionListener {
    JFrame j;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    public decToBin(){
        j=new JFrame("Dec to binary converter");
        l1=new JLabel("Decimal Value:");
        l2=new JLabel("Binary Value:");
        b1=new JButton("Convert");
        b1.addActionListener(this);
        t1=new JTextField(20);
        t2=new JTextField(100);
        j.setSize(500,300);
        l1.setBounds(20,50,200,20);
        t1.setBounds(230,50,200,20);
        b1.setBounds(90,80,100,20);
        l2.setBounds(20,110,200,20);
        t2.setBounds(230,110,200,20);
        j.setLayout(null);
        j.setDefaultCloseOperation(3);
        j.setVisible(true);
        
  j.add(l1);j.add(l2);j.add(t1);j.add(t2);j.add(b1);
        
    }
    public void actionPerformed(ActionEvent ex){
        int k=Integer.parseInt(t1.getText());
        int num=k;
        int val=0;
        int mod;
        while(num>0){
            num=num/2;
            val++;
        }
        num=k;
        int[] arr=new int[val];
        val=val-1;
        while(num>0){
            mod=num%2;
            arr[val]=mod;
            val--;
            num=num/2;
            
        }
        String l=Arrays.toString(arr);
        l=l.replace(",","");
        l=l.replace("[","");
        l=l.replace("]", "");
        t2.setText(" "+l);
    }
    
    


public static void main(String[] args){
new decToBin();
}}
