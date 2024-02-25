package builder2;

public class Main {

	public static void main(String[] args) {
		
		PhoneBuilder phoneBuilder =new PhoneBuilder();
		phoneBuilder.setBattery(123);
		phoneBuilder.setCamera(11);
		phoneBuilder.setOs("xyz");
		
		
		
		Phone phone=phoneBuilder.getPhone();
		
		System.out.println(phone);
	}

}
