
public class fibonici
{
 public static void main(String args[])
 {
	 int a=1;
	 int b=1;
	 int c;
	 System.out.println(a);
	 System.out.println(b);
	 
	 int i;
	 for(i=1;i<=18;i++)
	 {
		 c=a+b;
		 System.out.println(c);
		 a=b;
		 b=c;
     }
}
}
