//BorderLayout class
import java.awt.*;
class BorderLayoutDemo extends Frame
{
	BorderLayoutDemo()
	{
		BorderLayout f1=new BorderLayout(10,10);
		setLayout(f1);
		Button b1=new Button("EAST Button");
		Button b2=new Button("WEST Button");
		Button b3=new Button("SOUTH Button");
		Button b4=new Button("NORTH Button");
		TextArea ta1=new TextArea("Enter text here");
		add(b1,BorderLayout.EAST);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.NORTH);
		add(ta1,BorderLayout.CENTER);
	}
	public static void main(String args[])
	{
		BorderLayoutDemo f1=new BorderLayoutDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("BORDER LAYOUT");
	}
}