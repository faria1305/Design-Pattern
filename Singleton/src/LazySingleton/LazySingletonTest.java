package LazySingleton;

public class LazySingletonTest {

	public static void main(String[] args) {
		
		LazySingletoneSingleThread  instance1= LazySingletoneSingleThread .getInstancce();
		LazySingletoneSingleThread  instance2= LazySingletoneSingleThread .getInstancce();
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		
	}

}
