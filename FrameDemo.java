import java.awt.*;  
import java.awt.Frame;  

class FrameDemo extends Frame {  
    FrameDemo() {  
        setTitle("Frame");  
        setSize(500, 500);  
        setVisible(true);  
    }  

    public static void main(String args[]) {  
        new FrameDemo();  
    }  
}