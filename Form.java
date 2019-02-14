
//Creating a Form

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Form extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JRadioButton rb1,rb2,rb3;
JCheckBox cb1,cb2,cb3,cb4;
JTextField t1,t2,t3;
JTextArea ta;
JButton btn;
Form()
{
l1=new JLabel("First Name:");
l7=new JLabel("Last Name:");
l2=new JLabel("RollNo:");
l3=new JLabel("Adress:");
l4=new JLabel("Gender:");
l5=new JLabel("Qualification:");
l6=new JLabel();
l8=new JLabel();
l9=new JLabel();
l10=new JLabel();
l11=new JLabel();
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
ta=new JTextArea(2,4);
rb1=new JRadioButton("Male");
rb2=new JRadioButton("Female");
rb3=new JRadioButton("Others");
cb1=new JCheckBox("SSC"); 
cb2=new JCheckBox("HSC");
cb3=new JCheckBox("GRADUATE");
cb4=new JCheckBox("POST GRADUATE");
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
btn=new JButton("SUBMIT");

btn.addActionListener(this);
setLayout(new GridLayout(4,4));
add(l1);
add(t1);
add(l7);
add(t3);
add(l2);
add(t2);
add(l3);
add(new JScrollPane(ta));
add(l4);
add(rb1);
add(rb2);
add(rb3);
add(l5);
add(cb1);
add(cb2);
add(cb3);
add(btn);
add(l6);
add(l8);
add(l9);
add(l10);
add(l11);
}
public void actionPerformed(ActionEvent e)
{
String s1,s2,s3,s4,s5,s7,s8;
s1=t1.getText();
s2=t2.getText();
s7=t3.getText();
s3=ta.getText();
s4="";
s5="";

s8="";
if(rb1.isSelected())
s4=rb1.getText();
else if(rb2.isSelected())
s4=rb2.getText();
else if(rb3.isSelected())
s4=rb3.getText();

if(cb1.isSelected())
s5+=cb1.getText();
if(cb2.isSelected())
s5+=cb2.getText();
if(cb3.isSelected())
s5+=cb3.getText();
s8=s1+" "+s7;

l6.setText(s8);
l8.setText(s2);
l9.setText(s3);
l10.setText(s4);
l11.setText(s5);
}
public static void main(String args[])
{
Form f=new Form();
f.pack();
f.setVisible(true);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}