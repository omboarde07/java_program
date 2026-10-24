//JTree Class
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
class JTreeDemo extends JFrame
{
	JTreeDemo()
	{
		Container c=getContentPane();
		BorderLayout b1=new BorderLayout();
		c.setLayout(b1);
		
		DefaultMutableTreeNode lang=new DefaultMutableTreeNode("Language");
		
		DefaultMutableTreeNode pop=new DefaultMutableTreeNode("POP");
		DefaultMutableTreeNode p1=new DefaultMutableTreeNode("C Lang");
		DefaultMutableTreeNode p2=new DefaultMutableTreeNode("Fortran");
		DefaultMutableTreeNode p3=new DefaultMutableTreeNode("Cobol");
		DefaultMutableTreeNode p4=new DefaultMutableTreeNode("Pascal");
		pop.add(p1);
		pop.add(p2);
		pop.add(p3);
		pop.add(p4);
		
		DefaultMutableTreeNode oop=new DefaultMutableTreeNode("OOP");
		DefaultMutableTreeNode o1=new DefaultMutableTreeNode("C++");
		DefaultMutableTreeNode o2=new DefaultMutableTreeNode("Java");	
		DefaultMutableTreeNode o3=new DefaultMutableTreeNode("Python");	
		DefaultMutableTreeNode o4=new DefaultMutableTreeNode("C#");	
		oop.add(o1);	
		oop.add(o2);
		oop.add(o3);
		oop.add(o4);

		lang.add(pop);
		lang.add(oop);
		
		JTree jt=new JTree(lang);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(jt,v,h);
		c.add(jsp,BorderLayout.WEST);	
	}
	public static void main(String args[])
	{
		JTreeDemo f1=new JTreeDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("J TREE FRAME");
	}
}