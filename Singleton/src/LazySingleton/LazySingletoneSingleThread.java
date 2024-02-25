package LazySingleton;

public class LazySingletoneSingleThread {
	private static LazySingletoneSingleThread  instance;
	
	
	private LazySingletoneSingleThread () {
		};
		
		
		
		public static LazySingletoneSingleThread  getInstancce()
		{
			if(instance==null) {
				instance=new LazySingletoneSingleThread ();
				
			}
			return instance;
		}
	}


