class run
{
public static void main(String args[])
{
	find.j=10;
	find f=new find();
	f.i=20;
	f.display();
}
}

class find
{
	int i;
	static int j;
	void display()
	{
		System.out.println(i);
	}

	
}