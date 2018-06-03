
public class prime 
{
 public static void main(String args[])
 {
	 System.out.println("New code in this code");
	 boolean flag =true;
	 int n=5;
	 for(int i=2;i<=n-1;i++)
	 {
		if(n%i==0)
		{
			flag=true;
			break;
		}
	 }
		if(flag)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	 }
 }

