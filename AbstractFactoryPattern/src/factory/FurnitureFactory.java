package factory;
import product.*;

public interface FurnitureFactory {
	
	Chair CreateChair();
	CoffeeTable CreateCoffeeTable();
	Sofa CreateSofa();

}
