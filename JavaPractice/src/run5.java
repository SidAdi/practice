class box
{
	int height;
	int width;
	int lenght;
	
	box()
	{
		
	}
	box(int h,int w,int l)
    {
    	height=h;
    	width=w;
    	lenght =l;
    	
    }
	box(int n)
    {
    	height =width =lenght=n;
    }
    void display()
    {
    	System.out.println("["+height+","+width+","+lenght+"]");
    }
}

class run5
{
	public static void main(String args[])
	{
	box b1 = new box();
	box b2 = new box(1,2,3);
	box b3 = new box(4);
	b1.display();
	b2.display();
	b3.display();
		
	}
}
