package main;
import product.*;

import factory.*;

public class Main {
	public static void main(String[] args) {
		FurnitureFactory ArtDeco=new ArtDecoFactory();
		FurnitureFactory Victorian=new VictorianFactory();
		FurnitureFactory Modern=new ModernFactory();
		
		
		ArtDeco.CreateChair().printChair();
		Victorian.CreateChair().printChair();
		Modern.CreateChair().printChair();
		
	
	    System.out.println();
	    System.out.println();
	    
	    
	    ArtDeco.CreateSofa().printSofa();
		Victorian.CreateSofa().printSofa();
		Modern.CreateSofa().printSofa();
		
		System.out.println();
	    System.out.println();
	    
	    
	    ArtDeco.CreateCoffeeTable().printCoffeeTable();
		Victorian.CreateCoffeeTable().printCoffeeTable();
		Modern.CreateCoffeeTable().printCoffeeTable();
	    
	
	
	}

}
