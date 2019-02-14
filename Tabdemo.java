//tab demo in java swing api


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Tabdemo extends JFrame implements ActionListener
{
JTabbedPane tb= new JTabbedPane();
JButton b1,b2;
JTextField t1,t2,t3;
JRadioButton rb1,rb2;
JComboBox cb;
int i =0;
Tabdemo()
{
b1=new JButton("Click");
b2=new JButton("Click");
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
rb1=new JRadioButton("First");
rb2=new JRadioButton("Second");
cb=new JComboBox();
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
b1.addActionListener(this);
b2.addActionListener(this);
rb1.addActionListener(this);
rb2.addActionListener(this);
JPanel pn1=new JPanel();
pn1.add(b1);
pn1.add(t1);
tb.addTab("TAB1",pn1);
JPanel pn2=new JPanel();
pn2.add(rb1);
pn2.add(rb2);
pn2.add(t2);
tb.addTab("TAB2",pn2);
JPanel pn3=new JPanel();
pn3.add(cb);
pn3.add(t3);
pn3.add(b2);
tb.addTab("TAB3",pn3);
add(tb);
}
public void actionPerformed(ActionEvent e)
{

if(i==0)
{
t1.setEnabled(false);
i=1;
}
else
{
t1.setEnabled(true);
i=0;
}
if(rb1.isSelected())
{
t2.setText(rb1.getText());
}
else if(rb2.isSelected())
{
t2.setText(rb2.getText());
}


String s=t3.getText();
cb.addItem(s);
}

public static void main(String [] args)
{
Tabdemo t=new Tabdemo();
t.pack();
t.setVisible(true);
t.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
