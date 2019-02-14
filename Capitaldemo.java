//Shows the captial of the selected country

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Capitaldemo extends JFrame implements ActionListener
{
JComboBox cb;
JLabel lbl1,lbl2;
String[] s1={"INDIA","SRI-LANKA","USA","AUSTRALIA","UAE"};
String[] s2={"DELHI","COLOMBO","WASHINGTON","MELBOURNE","DUBAI"};
Capitaldemo()
{
lbl1=new JLabel("SELECT A COUNTRY:");
cb=new JComboBox<String>(s1);
lbl2=new JLabel("");
cb.addActionListener(this);
setLayout(new GridLayout(2,2));
add(lbl1);
add(cb);
add(lbl2);
}
public void actionPerformed(ActionEvent e)
{
int i=cb.getSelectedIndex();
if(i==0)
lbl2.setText(s2[i]);
else if(i==1)
lbl2.setText(s2[i]);
else if(i==2)
lbl2.setText(s2[i]);
else if(i==3)
lbl2.setText(s2[i]);
else if(i==4)
lbl2.setText(s2[i]);
}
public static void main(String[] args)
{
Capitaldemo cd=new Capitaldemo();
cd.pack();
cd.setVisible(true);
cd.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}