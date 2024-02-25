package eagerWaySingleton;

import LazySingleton.LazySingletoneSingleThread;

public class EagerWaySingletonTest {
	public static void main(String[] args) {
		 EagerWaySingleton  instance1=  EagerWaySingleton .getInstance();
		 EagerWaySingleton  instance2=  EagerWaySingleton .getInstance();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
