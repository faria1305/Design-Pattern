package product;

public class Car {
	
	private final String  carType;
    private final int seats;
    private final String  engine;
    private final String model;
   
    public Car(String carType, int seats,String engine,String model)
  {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.model = model;
  }

	public String getCarType() {
		return carType;
	}

	public int getSeats() {
		return seats;
	}

	public String getEngine() {
		return engine;
	}

	public String getModel() {
		return model;
	}
	
	
    
    
     
	
}
