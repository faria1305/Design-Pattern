package DeepCopy;

public class Circle2 extends Shape2{

	  int radius;
	
	@Override
	public  Shape2 clone()  {
		Circle2 c=new Circle2();
		c.radius=this.radius;
		c.setColour(this.getColour());
		for(String s :this.getCategory())
		{
			c.getCategory().add(s);
		}
		return c;
	}

	@Override
	public String toString() {
		return "Circle2 [radius=" + radius + "]";
	}

	
	
}
