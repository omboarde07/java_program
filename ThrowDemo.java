//throw keyword
class ThrowDemo
{
	void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not eligible for Voting");
		}
		else
		{
			System.out.println("Eligible for Voting");
		}
	}
	public static void main(String args[])
	{
		ThrowDemo t1=new ThrowDemo();
		t1.validate(15);
	}
}