package prototype;

public class Main {
	public static void main(String[] args) {
		 Font font1 = new Font("Normal", 12);
		 Circle circle=new Circle();
		 
		 circle.x=10;
		 circle.y=15;
		 circle.radius=2;
		
		 circle.font=font1;
		 
		 
		 Circle circleCopy=(Circle)circle.clone();
		 
		 System.out.println("Before Modification");
		 
		 
		 
		 System.out.println("Circle: " + circle);
		 System.out.println("CircleCopy: " + circleCopy);
	       
	       circle.font.fontName="Time new roman";
	       circle.x=100;
	       
	       System.out.println("After Modification of Circle");
	       
	       
	       System.out.println("Circle: " + circle);
		   System.out.println("CircleCopy: " + circleCopy);
	       
	       
	       
	       circleCopy.font.fontName="Text Font";
	       circleCopy.font.fontSize=24;
	       circleCopy.radius=200;
	       
	       System.out.println("After Modification of CircleCopy");
	       
	       System.out.println("Circle: " + circle);
		   System.out.println("CircleCopy: " + circleCopy);
	}
}
