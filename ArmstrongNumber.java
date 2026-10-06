class ArmstrongNumber
{
	public static void main(String args[])
	{
	int i,no,sum,rem;
	for(i=1;i<=999;i++)
	{
		no=i;
		sum=0;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
	}
	if(i==sum)
	{
		System.out.println("Armstrong Number : "+i);
	}
	}
}
}