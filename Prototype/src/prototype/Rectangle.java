package prototype;

public class Rectangle extends Shape {
	
public int height;
public int width;
	
	public Rectangle()
	{
		
	}
	
	public Rectangle (Rectangle target,Font font)
	{
		super(target,font);
		if(target !=null) {
			this.height=target.height;
			this.width=target.width;
		}
	}
	
	public Shape clone()
	{
		Font fontCopy=this.font.clone();
		return new Rectangle (this,fontCopy);
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + ", x=" + x + ", y=" + y + ", font=" + font + "]";
	}
  
	
}
