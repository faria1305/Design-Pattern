package shallowCopy;

public class Square extends Shape{
	public int a;
	
	
	
	public Square() {
		
	}
	
	public Square (Square obj)
	{
		super(obj);
		if(obj!=null)
		{
			this.a=obj.a;
		}
		
		
	}

	@Override
	public Shape clone () {
		// TODO Auto-generated method stub
		
		return new Square(this);
	}

	@Override
	public void draw() {
		System.out.println("Square  is drawing");
		
	}
	@Override
	public String toString() {
		
		return this.colour+" "+this.a;
	}
	

}
