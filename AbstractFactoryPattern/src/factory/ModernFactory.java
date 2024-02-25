package factory;
import product.*;

import ModernProduct.*;

public class ModernFactory implements FurnitureFactory{

	@Override
	public Chair CreateChair() {
		
		return new ModernChair();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new ModernCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new ModernSofa();
	}

}