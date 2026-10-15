import java.awt.*;
class ButtonDemo extends Frame
{
	ButtonDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		Button b1=new Button("BUTTON");
		Button b2=new Button("CANCEL");
		Button b3=new Button("RETRY");
		add(b1);
		add(b2);
		add(b3);
	}
	public static void main(String args[])
	{
		ButtonDemo bd=new ButtonDemo();
		bd.setVisible(true);
		bd.setSize(500,500);
		bd.setTitle("Om");
	}
}