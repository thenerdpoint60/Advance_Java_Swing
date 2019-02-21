import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Averagee extends JFrame implements ActionListener
{
 JTextField r,a;
JLabel d;
JButton sub;
	Averagee()
	{
	r = new JTextField("Roll");
	a= new JTextField("Marks");
	d = new JLabel();
	sub= new JButton("Submit");
setLayout(new FlowLayout());
	add(r);
	add(a);
	sub.addActionListener(this);
add(sub);
	add(d);

}
	public void actionPerformed(ActionEvent e)
	{
	String c = a.getText();
	String x = r.getText();
	String s;
	int z = Integer.parseInt(c);
	if(z>=80)
	{
	s = "The Grade for "+x+" is : A";
	}
	else if(60<=z && z<80)
	{
	s = "The Grade for "+x+" is : B";
	}
	else if(40<=z && z<60)
	{
	s = "The Grade for "+x+" is : C";
	}
	else
	{
	s = "The Grade for "+x+"is : D";
	}	
	d.setText(s);
	
}
}



public class grade
{
 public static void main(String[] args)
{
Averagee g = new Averagee();  
g.pack();
g.setSize(500,500);
g.setVisible(true);
//g.setDefaultCloseOperation(EXIT_ON_CLOSE);
}
}