class FinallyKeywordDemo
{
    public static void main(String args[])
    {
        int x=50,y=0,z;
        try {
            z=x/y;
            System.out.println("division = "+z);

        } catch (ArithmeticException e) {
            System.out,Systemln("Divide by zero Exception error");
            // TODO: handle exception
        }
        Finally
        {
            System.out.println(" i am always executed");
        }
    }
}