package builder;
import product.*;

public class CarBuilder implements Builder {
	
	private  String  carType;
    private  int seats;
    private  String  engine;
    private  String model;
	@Override
	public void setCarType(String type) {
		this.carType=type;
		
	}
	@Override
	public void setSeats(int seats) {
		this.seats=seats;
		
	}
	@Override
	public void setEngine(String engine) {
		this.engine=engine;
		
	}
	@Override
	public void setModel(String model) {
		this.model=model;
		
	}
	
	public Car getType()
	{
		return new Car(carType,seats,engine,model);
	}
    
    

}
