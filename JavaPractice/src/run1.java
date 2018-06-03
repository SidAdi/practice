
class run1 {

	public static void main(String args[])
	{
		ass a1=new ass();
		a1.a=10;
		ass a2=new ass();
		a2.a=20;
		a1.display();
	    a2.display();
	}
}

class ass
{
	int a;
	void display()
	{
		int a=1;
		System.out.println(a);
		System.out.println(this.a);
		
	}
}