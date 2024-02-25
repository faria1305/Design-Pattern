package DeepCopy;

public class Main2 {
	
	public static void main(String[] args) {
	Circle2 circle2 =new Circle2();
	circle2.radius=5;
	circle2.loadData();
	
	System.out.println(circle2);
	System.out.println(circle2.getCategory());
	
	Circle2 copyCircle2=(Circle2)circle2.clone();
	
	System.out.println(copyCircle2);
	System.out.println(copyCircle2.getCategory());
	
	
	circle2.getCategory().add("yellow");
	
	copyCircle2.getCategory().remove(0);
	
	
	System.out.println(circle2);
	System.out.println(circle2.getCategory());
	
	System.out.println();
	
	
	System.out.println(copyCircle2);
	System.out.println(copyCircle2.getCategory());
	
	
	
	
	}
	
}
