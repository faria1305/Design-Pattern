package builder2;

public class Phone {
       private String os;
       private String processor;
       private int screenSize;
       private int camera;
       private int battery;
       
       
       
	public Phone(String os, String processor, int screenSize, int camera, int battery) {
		this.os = os;
		this.processor = processor;
		this.screenSize = screenSize;
		this.camera = camera;
		this.battery = battery;
	}



	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", camera=" + camera
				+ ", battery=" + battery + "]";
	}
	
	
       
       
       
}
