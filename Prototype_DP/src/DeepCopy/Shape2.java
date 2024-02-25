package DeepCopy;

import java.util.ArrayList;
import java.util.List;



public abstract class  Shape2{
	

	
	private  String colour;
	private List <String> category=new ArrayList<>();
	
	
	
	
	 public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public List<String> getCategory() {
		return category;
	}



	public void setCategory(List<String> category) {
		this.category = category;
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


	public abstract Shape2 clone();

	@Override
	public String toString() {
		return "Shape [colour=" + colour + ", category=" + category + "]";
	}

	
	
}
