package com.mycompany.mavenproject2;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
public class studentInfo implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3;
    JTextArea t4;
    JCheckBox c1,c2,c3;
    JRadioButton r1,r2;
    JComboBox b;
    JButton p;
public studentInfo(){    
    f=new JFrame("Student Information");
    l1=new JLabel("Roll");
    t1=new JTextField(30);
    t4=new JTextArea();
    l2=new JLabel("Name");
    t2=new JTextField(30);
    l3=new JLabel("College");
    t3=new JTextField(30);
    l4=new JLabel("Gender:");
    r1=new JRadioButton("Male");
    r2=new JRadioButton("Female");
    ButtonGroup bg=new ButtonGroup();
    bg.add(r1);bg.add(r2);
    l5=new JLabel("Hobbies:");
    c1=new JCheckBox("Playing");
    c2=new JCheckBox("Reading");
    c3=new JCheckBox("Swimming");
    l6=new JLabel("Program");
    String[] pro={"BCA","Bsc.CSIT","BIT","BICT"};
    b=new JComboBox(pro);
    p=new JButton("Save");
    p.addActionListener(this);
    f.setSize(800,500);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);
    l1.setBounds(20,50,100,20);
    t1.setBounds(100,50,100,20);
    t4.setBounds(300,50,400,300);
    l2.setBounds(20,90,100,20);
    t2.setBounds(100,90,100,20);
    l3.setBounds(20,130,100,20);
    t3.setBounds(100,130,100,20);
    l4.setBounds(20,160,70,20);
    r1.setBounds(100,160,60,10);
    r2.setBounds(100,190,90,10);
    l5.setBounds(20,210,80,10);
    c1.setBounds(40,230,100,20);
    c2.setBounds(40,250,100,20);
    c3.setBounds(40,270,100,20);
    l6.setBounds(20,300,100,20);
    b.setBounds(20,330,100,20);
    p.setBounds(100,400,80,30);
    f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);
    f.add(t1);f.add(t2);f.add(t3);f.add(t4);
    f.add(r1);f.add(r2);
    f.add(c1);f.add(c2);f.add(c3);
    f.add(b);
    f.add(p);
    
   
    
}
public void actionPerformed(ActionEvent e){
    int roll=Integer.parseInt(t1.getText());
    String name=t2.getText();
    String college=t3.getText();
    String gender=r1.isSelected()?"Male":"Female";
    StringBuilder hobbies = new StringBuilder();
    if (c1.isSelected()) {
    hobbies.append("Playing "+",");
    }
    if (c2.isSelected()) {
    hobbies.append("Reading "+",");
    }
    if (c3.isSelected()) {
    hobbies.append("Swimming");
    }
    String program = b.getSelectedItem().toString();
    t4.setText("Roll: "+roll+"\n"+"Name: "+name+"\n"+"College: "+college+"\n"+"Gender: "+gender+"\n"+"Hobbies: "+hobbies+"\n"+"Program: "+program);

    
   
    
}
    public static void main(String[] args) {
        new studentInfo();
    }
}
