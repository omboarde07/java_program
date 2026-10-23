//Class : MouseEvent ,Interface:MouseListener & MouseMotionListener
import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame implements MouseListener
{
	MouseEventDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		Button b1=new Button("Login");
		add(b1);
		b1.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		System.out.println("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent me)
	{
		System.out.println("Mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		System.out.println("Mouse Exited");
	}
	public void mousePressed(MouseEvent me)
	{
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent me)
	{
		System.out.println("Mouse Released");
	}
	public static void main(String args[])
	{
		MouseEventDemo f1=new MouseEventDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("MOUSE LISTENER");
	}
}