import java.awt.*;
class CheckboxDemo extends CheckboxDemo
{
    CheckboxDemo()
    {
        FlowLayout f1=new FlowLayout()
        setLayout(f1);
        Checkbox c1=new Checkbox("JAVA");
        Checkbox c2=new Checkbox("C++");
        Checkbox c3=new Checkbox("c#",true);
        add(c1);
        add(c2);
        add(c3);
    }
    public static void main(String args[])
    {
        CheckboxDemo cbd=new CheckboxDemo();
        cbd.setSize(500,500);
        cbd.setTitle("CHECKBOX");
        cbd.setVisible(true);
    }
}