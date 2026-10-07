import java.util.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class UserdefinedExeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name");
		Sting name=sc.next();
		System.out.println("Enter Customer balance");
		int balance=sc.nextInt();
		if(balance<1500)
		{
			try
			{
				throw new MyException("Balance less then 1500");
			}
			catch(MyException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("Balance greter then 1500");
		}
	}
}