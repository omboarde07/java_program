import java.awt.*;
import java.awt.event.*;
class TextFieldDemo extends Frame
{
 TextFieldDemo()
	{
	FlowLayout f1 = new FlowLayout();
	setLayout(f1);
	setBackground(Color,GREEN);
	
	Label l1 = new Label("ENTER USER NAME");
	Label l2 = new Label("ENTER PASSWORD");

	TextField tf1 = new TextField(20);
	TextField tf2 = new TextField(20);

	Button b1 = new Button("Login");
	tf2.setEchoChar('*');
	
	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(b1);
	}
public static void main(String args[])
	{
	TextFieldDemo f1 = new TextFieldDemo();
	f1.setVisible(true);
	f1.setTitle("Login From");
	f1.setSize(500,500);
	f1.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}