package newcrud;
import javax.swing.*;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.sql.*;

public class crud implements ActionListener{
     JFrame f,deleteframe,updateframe;
        JLabel l1,l2,l3,l4,l5,l6,l7,l8;
        JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9;
        JButton b1,b2,b3,b4,b5,b6;
        JTextArea t1;
       
    public crud(){
       
        f=new JFrame("Crud Operation");
        l1=new JLabel("EID");
        l2=new JLabel("Name");
        l3=new JLabel("Address");
        l4=new JLabel("Department");
        f1=new JTextField(50);
        f2=new JTextField(50);
        f3=new JTextField(50);
        f4=new JTextField(50);
        t1=new JTextArea(100,100);
        b1=new JButton("Save");
        b1.addActionListener(this);
        b2=new JButton("Delete");
        b2.addActionListener(this);
        b3=new JButton("Update");        
        b3.addActionListener(this);
        b6=new JButton("Display");
        b6.addActionListener(this);
        
        
        
        l1.setBounds(20,50,100,20);
        f1.setBounds(120,50,100,20);
        l2.setBounds(20,80,100,20);
        f2.setBounds(120,80,100,20);
        l3.setBounds(20,110,100,20);
        f3.setBounds(120,110,100,20);
        l4.setBounds(20,130,100,20);
        f4.setBounds(120,130,100,20);
        b1.setBounds(20,160,100,20);
        b2.setBounds(130,160,100,20);
        b3.setBounds(240,160,100,20);
        b6.setBounds(350,160,100,20);
        t1.setBounds(0,190,600,300);
        
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(f1);f.add(f2);f.add(f3);f.add(f4);
        f.add(b1);f.add(b2);f.add(b3);f.add(b6);
        f.add(t1);
        
        f.setSize(600,600);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        f.setVisible(true);
        //Delete Operation
            deleteframe=new JFrame("Delete operation");
            l5=new JLabel("EID:");
            f9=new JTextField(50);
            b4=new JButton("Delete");
            b4.addActionListener(this);
            deleteframe.setSize(300,300);
            l5.setBounds(50,50,100,20);
            f9.setBounds(160,50,100,20);
            b4.setBounds(50,100,100,20);
            deleteframe.add(l5);deleteframe.add(f9);deleteframe.add(b4);
            deleteframe.setLayout(null);
            deleteframe.setDefaultCloseOperation(3);
       //update Operation     
            updateframe=new JFrame("update operation");
            l5=new JLabel("EID:");
            f5=new JTextField(50);
            l6=new JLabel("Name");
            l7=new JLabel("Address");
            l8=new JLabel("Department");
            f6=new JTextField(50);
            f7=new JTextField(50);
            f8=new JTextField(50);
           
            
            b5=new JButton("Update");
            b5.addActionListener(this);
            updateframe.setSize(300,300);
            l5.setBounds(20,50,100,20);
            f5.setBounds(130,50,100,20);
            l6.setBounds(20,80,100,20);
            f6.setBounds(130,80,100,20);
            l7.setBounds(20,110,100,20);
            f7.setBounds(130,110,100,20);
            l8.setBounds(20,140,100,20);
            f8.setBounds(130,140,100,20);
            b5.setBounds(50,170,100,20);
            updateframe.add(l5);updateframe.add(f5);updateframe.add(b5);updateframe.add(l6);
            updateframe.add(l7);updateframe.add(l8);
            updateframe.add(f6);updateframe.add(f7);updateframe.add(f8);
            updateframe.setLayout(null);
            updateframe.setDefaultCloseOperation(3);
    }
    public void actionPerformed(ActionEvent e){
        t1.setText(null);
        if(e.getSource()==b1){
            String a=f1.getText();
            String b=f2.getText();
            String c=f3.getText();
            String d=f4.getText();
            String g="('"+a+"','"+b+"','"+c+"','"+d+"')";
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3304/company","root","");
                PreparedStatement ps=con.prepareStatement("insert into employee(eid,name,address,department)values"+g);
                int r=ps.executeUpdate();
                if(r==0){
                    throw new Exception("Cannot insert the data");
                }
            }catch(Exception ex){
                System.out.println(ex);
            }finally{
                f1.setText(null);
                f2.setText(null);
                f3.setText(null);
                f4.setText(null);
                
            }
        }
        if(e.getSource()==b2){
            deleteframe.setVisible(true);
        }
        if(e.getSource()==b4){
           
            String z=f9.getText();
           
             try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3304/company","root","");
            PreparedStatement ps=con.prepareStatement("delete from employee where eid='"+z+"'");
           int i=ps.executeUpdate();
           if(i==0){
               throw new Exception("Couldn't delete the datafrom Database.");
           }
           
            }catch (Exception ex){
                System.out.println(ex);
            }
            
        }
        if(e.getSource()==b3){
            updateframe.setVisible(true);
        }
        if(e.getSource()==b5){
            String s=f5.getText();
            String t=f6.getText();
            String u=f7.getText();
            String v=f8.getText();
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3304/company","root","");
            String g="update employee set name='"+t+"',address='"+u+"',department='"+v+"'where eid='"+s+"'";
            PreparedStatement ps=con.prepareStatement(g);
            int i=ps.executeUpdate();
            if(i==0){
                throw new Exception("failed to update");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
                f5.setText(null);f6.setText(null);f7.setText(null);f8.setText(null);
            }
        }
        if(e.getSource()==b6){
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3304/company","root","");
            PreparedStatement ps=con.prepareStatement("select *from employee");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String eid1=rs.getString("eid");
                String name1=rs.getString("name");
                String address=rs.getString("address");
                String department=rs.getString("department");
                t1.append("|  "+eid1+"  |  "+name1+"  |  "+address+"  |  "+department+"  |\n");
            }
        }catch(Exception ex){
            System.out.println(ex);
        }
        }
        
    }
    public static void main(String[] args){
        new crud();
    }
    
}
