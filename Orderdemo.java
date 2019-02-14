//Always wanting  aicecream
//built a billing counter for an icecream parlour


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Orderdemo extends JFrame implements ActionListener
{
JList l1;
JLabel lbl1,lbl2,lbl3;
JRadioButton rb1,rb2;
JButton btn;
String[] f={"Blueberry","Belgian Chocolate","Fruit & Nut","Roasted Almond","Tender Coconut"};
int[] p={50,60,45,55,50};
Orderdemo()
{
l1=new JList<String>(f);
lbl1=new JLabel("Select the Favours:");
lbl2=new JLabel("Select the Base:");
rb1=new JRadioButton("Cone");
rb2=new JRadioButton("Cup");
ButtonGroup bg=new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
lbl3=new JLabel("");
btn=new JButton("ORDER");
setLayout(new GridLayout(4,4));
btn.addActionListener(this);
add(lbl1);
add(l1);
add(lbl2);
add(rb1);
add(rb2);
add(btn);
add(lbl3);
}
public void actionPerformed(ActionEvent e)
{
int i=l1.getSelectedIndex();
int pr1=p[i];
int pr2=0;
if(rb1.isSelected())
pr2=20;
else if(rb2.isSelected())
pr2=10;
int pr=pr1+pr2;
lbl3.setText("Total Bill:"+pr);
}
public static void main(String[] args)
{
Orderdemo id=new Orderdemo();
id.pack();
id.setVisible(true);
id.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}