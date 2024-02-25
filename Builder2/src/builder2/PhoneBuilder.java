package builder2;

public class PhoneBuilder {

	
	private String os;
    private String processor;
    private int screenSize;
    private int camera;
    private int battery;
    
    
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	public void setCamera(int camera) {
		this.camera = camera;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	
	public Phone getPhone()
	{
		return new Phone(os,processor,screenSize,camera,battery);
	}
    
    
    
    
}
