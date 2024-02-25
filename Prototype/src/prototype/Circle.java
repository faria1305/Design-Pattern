package prototype;

public class Circle  extends Shape{
	
	public int radius;
	
	public Circle()
	{
		
	}
	
	public Circle (Circle target,Font font)
	{
		super(target,font);
		if(target !=null) {
			this.radius=target.radius;
		}
	}
	
	public Shape clone()
	{
		Font fontCopy=this.font.clone();
		return new Circle (this,fontCopy);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + ", font=" + font + "]";
	}

	
}
