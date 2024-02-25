package LazySingleton;

public class LazySingletoneMultiThreadTest {
	  public static void main(String[] args) {
	
	Thread threadFoo = new Thread(new ThreadFoo());
    Thread threadBar = new Thread(new ThreadBar());
    threadFoo.start();
    threadBar.start();
}

static class ThreadFoo implements Runnable {
    @Override
    public void run() {
    	LazySingletonMultiThread singleton = LazySingletonMultiThread.getInstance("FOO");
        System.out.println(singleton.value);
    }
}

static class ThreadBar implements Runnable {
    @Override
    public void run() {
    	LazySingletonMultiThread singleton = LazySingletonMultiThread.getInstance("BAR");
        System.out.println(singleton.value);
    }
}
}



