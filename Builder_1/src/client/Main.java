package client;
import builder.*;
import BluePrint.*;
import product.*;

public class Main {
	
	 public static void main(String[] args) {
		 
		 Director director=new Director();
		 CarBuilder carBuilder=new CarBuilder();
		 
		 // using director class
		 
		 director.constructCityCar(carBuilder);
		 
		 
		 Car car=carBuilder.getType();
		 System.out.println("Car Type="+car.getCarType());
		 System.out.println("Car Engine="+car.getEngine());
		 System.out.println("Car Model="+car.getModel());
		 
		 // Using  car builder class directly
		 
		 System.out.println();
		 System.out.println();
		 
		 
		 System.out.println("Using Builder Class Directly");
		 
		 CarBuilder carBuilder2=new CarBuilder();
		 carBuilder2.setModel("premio★★");
		 carBuilder2.setEngine("Inline 4");
		 
		 Car car2=carBuilder.getType();		 
		 
		 System.out.println("Car Engine="+car.getEngine());
		 System.out.println("Car Model="+car.getModel());
		 
		 
		 
		 // car Manual
		 
		 ManualBuilder manualBuilder =new ManualBuilder();
		 
		 director.constructCityCar(manualBuilder);
		 
		 Manual manual=manualBuilder.getType();
		 
		 System.out.println();
		 System.out.println();
		 
		 System.out.println(manual);
		 
		 
		
		 
		 
		 
			
		 
		 
		 
	 }

}
