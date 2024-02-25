package product;

public class Manual {

	private final String  carType;
    private final int seats;
    private final String  engine;
    private final String model;
   
    public Manual(String carType, int seats,String engine,String model)
  {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.model = model;
  }

	@Override
	public String toString() {
		return "Manual [carType=" + carType + ", seats=" + seats + ", engine=" + engine + ", model=" + model + "]";
	}
    
    
   
}
