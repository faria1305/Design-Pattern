package shallowCopy;
import java.util.*;

public abstract class Shape  {
	
	public String colour;
	public List <String> category=new ArrayList<>();
	
	public Shape() {
		
	}
	
	public Shape(Shape obj)
	{
		if(obj!=null)
		{
			this.colour=obj.colour;
			this.category=obj.category;
		}
	}
	public void loadData()
	{
		category.add("red");
		category.add("blue");
		category.add("white");
		try {
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	 public abstract Shape clone();
	 public abstract void draw();

	@Override
	public String toString() {
		return "Shape [colour=" + colour + ", category=" + category + "]";
	}

	

}
