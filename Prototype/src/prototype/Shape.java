package prototype;

public abstract class Shape {

	public int x;
	public int y;
	public Font font;
	
	
	
	//Default Constructor
	
	public Shape()
	{
		
	}
	
	public Shape (Shape target,Font fontCopy)
	{
		if(target != null)
		{
			this.x=target.x;
			this.y=target.y;
			this.font=fontCopy;
		}
	}
	
	public abstract Shape clone();
	
}
