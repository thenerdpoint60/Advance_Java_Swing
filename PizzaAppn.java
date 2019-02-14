//Joe special is 2 Pizza
//Ordering a pizza

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

class PizzaAppn extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2;
JTextArea ta;
JList l;
JButton btn;
JRadioButton rb1,rb2,rb3,rb4;
String [] toppings={"papporoni","onion","capsicum","paneer","corn","sasuage","olives"};
PizzaAppn()
{
l1=new JLabel("Name:");
l2=new JLabel("Address:");
l3=new JLabel("Mobile No:");
l4=new JLabel("Toppings");
l5=new JLabel("Crust Type");
l6=new JLabel();
t1=new JTextField(5);
t2=new JTextField(5);
ta=new JTextArea(3,3);
l=new JList<String>(toppings);
btn=new JButton("SUBMIT");
rb1=new JRadioButton("Basic");
rb2=new JRadioButton("Thick & Chewe");
rb3=new JRadioButton("Thin & Crispy");
rb4=new JRadioButton("Chicago dip dish");
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
btn.addActionListener(this);
setLayout(new GridLayout(8,8));
add(l1);
add(t1);
add(l2);
add(ta);
add(l3);
add(t2);
add(l5);
add(rb1);
add(rb2);
add(rb3);
add(rb4);
add(l6);BCXVLBC
add(l4);
add(new JScrollPane(l));
add(btn);
}
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
String s2=ta.getText();
String s3=t2.getText();
String s4="";
String s5="";

if(rb1.isSelected())
s4=rb1.getText();
else if(rb2.isSelected())
s4=rb2.getText();
else if(rb3.isSelected())
s4=rb3.getText();
else if(rb4.isSelected())
s4=rb4.getText();

int [] select=l.getSelectedIndices();

for(int i=0;i<select.length;i++)
{
s5=s5+" "+toppings[select[i]];
}

String s6=s1+" "+s2+" "+s3+" "+s4+" "+s5;
JOptionPane.showMessageDialog(this,s6,"Order Placed",JOptionPane.INFORMATION_MESSAGE);
}

public static void main(String args[])
{
PizzaAppn pa=new PizzaAppn();
pa.pack();
pa.setVisible(true);
pa.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}