package BluePrint;
import builder.*;

public class Director {
	public Director()
	{
		
	}
	
	 public void constructSportsCar(Builder builder) {
	        builder.setCarType("Sport");
	        builder.setSeats(2);
	        builder.setEngine("HCCI");
	        builder.setModel("Honda Civic");

}
	 
	 public void constructCityCar(Builder builder) {
		 
		 builder.setCarType("City");
	        builder.setSeats(4);
	        builder.setEngine("Diesel");
	        builder.setModel("Toyota");
	 }
}
