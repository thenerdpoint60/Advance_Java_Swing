//A basic Job portal form

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Jobdemo extends JFrame implements ActionListener
{
JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
JTextField tf1,tf2,tf3,tf4,tf5;
JButton btn;
Jobdemo()
{
lbl1=new JLabel("NAME:");
lbl2=new JLabel("AGE:");
lbl3=new JLabel("QUALIFICATION:");
lbl4=new JLabel("SPECILIZATION:");
lbl5=new JLabel("PERCENTAGE:");
tf1=new JTextField(10);
tf2=new JTextField(10);
tf3=new JTextField(10);
tf4=new JTextField(10);
tf5=new JTextField(10);
btn=new JButton("CHECK");
setLayout(new GridLayout(2,2));
btn.addActionListener(this);
add(lbl1);
add(tf1);
add(lbl2);
add(tf2);
add(lbl3);
add(tf3);
add(lbl4);
add(tf4);
add(lbl5);
add(tf5);
add(btn);
}
public void actionPerformed(ActionEvent e)
{
String ag=tf2.getText();
String qa=tf3.getText();
String sp=tf4.getText();
String per=tf5.getText();
int per1= Integer.parseInt(per);
if((per1>=55) && (qa.equals("post graduation")) && (sp.equals("computer science")))
JOptionPane.showMessageDialog(this,"REGISTERED & QUALIFIED","qualifiaction",JOptionPane.INFORMATION_MESSAGE);
else
JOptionPane.showMessageDialog(this,"REGISTERED & NOT QUALIFIED","qualifiaction",JOptionPane.WARNING_MESSAGE);
}
public static void main(String[] args)
{
Jobdemo jb=new Jobdemo();
jb.pack();
jb.setVisible(true);
jb.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}