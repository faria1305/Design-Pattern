package factory;
import product.*;

import VictorianProduct.*;
public class VictorianFactory implements FurnitureFactory{

	@Override
	public Chair CreateChair() {
		
		return new VictorianChair();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new VictorianCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new VictorianSofa();
	}

}