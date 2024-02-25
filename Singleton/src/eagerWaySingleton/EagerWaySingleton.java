package eagerWaySingleton;

public class EagerWaySingleton {
	
	private static EagerWaySingleton obj = new EagerWaySingleton();
    private EagerWaySingleton() {}
 
    public static EagerWaySingleton getInstance() { return obj; }

}
