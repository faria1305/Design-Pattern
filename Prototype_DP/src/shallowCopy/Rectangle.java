package shallowCopy;

public class Rectangle extends Shape{
	public int width;
	public int height;
	
	
	public Rectangle() {
		
	}
	
	public Rectangle(Rectangle obj)
	{
		super(obj);
		if(obj!=null)
		{
			this.width=obj.width;
			this.height=obj.height;		}
		
		
	}

	@Override
	public Shape clone () {
		// TODO Auto-generated method stub
		
		return new Rectangle(this);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle is drawing");
		
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", colour=" + colour + ", category=" + category
				+ "]";
	}

	

}
