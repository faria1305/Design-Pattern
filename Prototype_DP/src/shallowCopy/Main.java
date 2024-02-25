package shallowCopy;

public class Main {

	public static void main(String[] args) {

       Circle circle =new Circle();
       circle.colour="red";
       circle.redius=5;
       circle.loadData();
       //circle.category.add("circle1");
       //circle.category.add("circle2");
      // circle.category.add("circle3");
       
       
       
       Circle circleCopy =(Circle) circle.clone();
       
       
       
      System.out.println(circle.toString());
      System.out.println(circleCopy.toString());
      
      
      circle.category.remove(0);
      System.out.println(circle.toString());
      System.out.println(circleCopy.toString());
	}

}
