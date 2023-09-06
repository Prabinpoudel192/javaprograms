package com.mycompany.mavenproject2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ticketBooking implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    JTextArea l9;//here i will display the input taken from the user
    JTextField f1,f2,f3,f4;
    JRadioButton r1,r2;
    JComboBox b1,b2,b3;
    JButton k;
    public ticketBooking(){
        f=new JFrame("Sajha Yatayat");
        l1=new JLabel("Name:");
        l2=new JLabel("Address:");
        l3=new JLabel("Mobile:");
        l4=new JLabel("From");
        l5=new JLabel("To");
        l6=new JLabel("Gender");
        l7=new JLabel("Price");
        l8=new JLabel("Time");
        l9=new JTextArea();
        f1=new JTextField(30);
        f2=new JTextField(50);
        f3=new JTextField(11);
        f4=new JTextField(10);
        r1=new JRadioButton("Male");
        r2=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        String[] from={"Kathmandu","Pokhara","Chitwan","Jhapa","Birgunj","Biratnagar"};
        b1=new JComboBox(from);
        String[] to={"Kathmandu","Pokhara","Chitwan","Jhapa","Birgunj","Biratnagar"};
        b2=new JComboBox(to);
        String[] time={"10:00am","11:00am","12:00am","05:00pm","06:00pm","07:00pm"};
        b3=new JComboBox(time);
        k=new JButton("Save");
        k.addActionListener(this);
        f.setSize(900,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,30,100,20);
        f1.setBounds(130,30,100,20);
        l9.setBounds(400,30,400,300);
        l2.setBounds(20,60,100,20);
        f2.setBounds(130,60,100,20);
        l3.setBounds(20,90,100,20);
        f3.setBounds(130,90,100,20);
        l4.setBounds(20,120,100,20);
        b1.setBounds(120,120,80,20);
        l5.setBounds(210,120,80,20);
        b2.setBounds(300,120,80,20);
        l6.setBounds(20,150,80,20);
        r1.setBounds(110,150,80,20);
        r2.setBounds(200,150,80,20);
        l7.setBounds(20,180,100,20);
        f4.setBounds(130,180,80,20);
        l8.setBounds(20,210,80,20);
        b3.setBounds(110,210,80,20);
        k.setBounds(80,240,80,20);
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);
        f.add(f1);f.add(f2);f.add(f3);f.add(f4);
        f.add(r1);f.add(r2);
        f.add(k);
        f.add(b1);f.add(b2);f.add(b3);
        f.add(l9);
        
        
    }
    public void actionPerformed(ActionEvent e){
        String name=f1.getText();
        String address=f2.getText();
        String mobile=f3.getText();
        String from=b1.getSelectedItem().toString();
        String to=b2.getSelectedItem().toString();
        String gender=r1.isSelected()?"Male":"Female";
        int price=Integer.parseInt(f4.getText());
        String time=b3.getSelectedItem().toString();
        l9.setText("Name: "+name+"\n"+"Address: "+address+"\n"+"Mobile: "+mobile+"\n"+"From: "+from+"  "+"To: "+to+"\n"+"Gender: "+gender+"\n"+"Price: "+price+"\n"+"Time: "+time);
    }
    public static void main(String[] args){
        new ticketBooking();
    }
    
    
}
