//JAVA SWING API PRACTICAL 1
//Shows an Image

//imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Imagedemo extends JFrame implements ActionListener
{//declarations
JTextField tf;
JLabel l1,l2;
JButton btn;
Imagedemo()//constructor
{
tf=new JTextField(10);
l1=new JLabel("Enter path or name of Image:");
l2=new JLabel();
l2.setOpaque(true);
btn=new JButton("Click.");
btn.addActionListener(this);
setLayout(new GridLayout(2,2));
add(l1);add(tf);

add(btn);
add(new JScrollPane(l2));
}
public void actionPerformed(ActionEvent e)
{
String s=tf.getText();
ImageIcon ic=new ImageIcon(s);//gets the image icon
l2.setIcon(ic);
}
public static void main(String [] args)
{
Imagedemo i=new Imagedemo();
i.pack();
i.setVisible(true);
i.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}
