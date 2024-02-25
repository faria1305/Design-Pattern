package LazySingleton;

public class LazySingletonMultiThread {
	
private static LazySingletonMultiThread  instance;
public String value;
	
	
private LazySingletonMultiThread(String value) {
    // The following code emulates slow initialization.
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
        ex.printStackTrace();
    }
    this.value = value;
}
		
		
		
		public static LazySingletonMultiThread  getInstance(String value)
		{
			if(instance==null) {
				
				 synchronized ( LazySingletonMultiThread.class)
				 {
					 if(instance==null)
					 {
						 instance=new LazySingletonMultiThread (value);
					 }
						 
					 
				 }
				
				
			}
			return instance;
		}
	}



