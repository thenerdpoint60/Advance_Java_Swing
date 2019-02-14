//Displaying imgaes as per the radiobutton slected

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Imagedemo2 extends JFrame implements ActionListener
{
JLabel lbl1,lbl2;
JRadioButton rb1,rb2,rb3,rb4,rb5;
JButton btn;
Imagedemo2()
{
lbl1=new JLabel("Select an image to display:");
rb1=new JRadioButton("Happy");
rb2=new JRadioButton("Sad");
rb3=new JRadioButton("Best of luck");
rb4=new JRadioButton("Cry");
rb5=new JRadioButton("Laugh");
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
bg.add(rb3);
bg.add(rb4);
bg.add(rb5);
btn=new JButton("Display");
lbl2=new JLabel("");
setLayout(new GridLayout(4,4));
lbl2.setOpaque(true);
btn.addActionListener(this);
add(lbl1);
add(rb1);
add(rb2);
add(rb3);
add(rb4);
add(rb5);
add(btn);
add(new JScrollPane(lbl2));
}
public void actionPerformed(ActionEvent e)
{
ImageIcon i1=new ImageIcon("happy.png");
ImageIcon i2=new ImageIcon("sad.jpg");
ImageIcon i3=new ImageIcon("best.png");
ImageIcon i4=new ImageIcon("cry.jpg");
ImageIcon i5=new ImageIcon("laugh.png");
if(rb1.isSelected())
lbl2.setIcon(i1);
else if(rb2.isSelected())
lbl2.setIcon(i2);
else if(rb3.isSelected())
lbl2.setIcon(i3);
else if(rb4.isSelected())
lbl2.setIcon(i4);
else if(rb5.isSelected())
lbl2.setIcon(i5);
}
public static void main(String[] args)
{
Imagedemo2 id=new Imagedemo2();
id.pack();
id.setVisible(true);
id.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}