//GridLayout class
import java.awt.*;
class GridLayoutDemo extends Frame
{
	GridLayoutDemo()
	{
		GridLayout g1=new GridLayout(5,5);
		setLayout(g1);
		for(int i=1;i<=25;i++)
		{
			add(new Button("Button "+i));
		}
	}
	public static void main(String args[])
	{
		GridLayoutDemo f1=new GridLayoutDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("GRID LAYOUT");
	}
}