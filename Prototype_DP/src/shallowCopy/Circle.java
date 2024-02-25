package shallowCopy;

public class Circle extends Shape{
	public int redius;
	
	
	
	public Circle() {
		
	}
	
	public Circle(Circle obj)
	{
		super(obj);
		if(obj!=null)
		{
			this.redius=obj.redius;
		}
		
		
	}

	@Override
	public Shape clone () {
		// TODO Auto-generated method stub
		
		return new Circle(this);
	}

	@Override
	public void draw() {
		System.out.println("Circle is drawing");
		
	}

	@Override
	public String toString() {
		return "Circle [redius=" + redius + ", colour=" + colour + ", category=" + category + "]";
	}

	
	
	

}
