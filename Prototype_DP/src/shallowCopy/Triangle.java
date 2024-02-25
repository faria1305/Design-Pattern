package shallowCopy;

public class Triangle extends Shape{
	public int base;
	public int height;
	
	
	
	public Triangle () {
		
	}
	
	public  Triangle( Triangle obj)
	{
		super(obj);
		if(obj!=null)
		{
			this.base=obj.base;
			this.height=obj.height;
		}
		
		
	}

	@Override
	public Shape clone () {
		// TODO Auto-generated method stub
		
		return new  Triangle(this);
	}

	@Override
	public void draw() {
		System.out.println("Triangle  is drawing");
		
	}
	
	@Override
	public String toString() {
		
		return this.colour+" "+this.height+" "+this.base;
	}
	
	

}
