importjava.awt.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.*;
 class ButtonDemo extends Frame
 {
	ButtonDemo()
	{
		Button b1 = new Button("Click Me");
		b1.setBounds(30, 50, 100, 30);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked!");
			}
		});
		
		add(b1);
		
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
 }