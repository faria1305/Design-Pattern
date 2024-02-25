package factory;

import product.*;

import ArtDecoProduct.*;

public class ArtDecoFactory implements FurnitureFactory{

	@Override
	public Chair CreateChair() {
		
		return new ArtDecoChair();
	}

	@Override
	public CoffeeTable CreateCoffeeTable() {
		// TODO Auto-generated method stub
		return new ArtDecoCoffeeTable();
	}

	@Override
	public Sofa CreateSofa() {
		// TODO Auto-generated method stub
		return new ArtDecoSofa();
	}

}
