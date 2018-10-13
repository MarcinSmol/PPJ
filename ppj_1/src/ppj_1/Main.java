package ppj_1;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(1);
		circle.setRadius(4.1);
		System.out.println("Powierzchnia (promień= " + circle.getRadius() + ") = " + (int) circle.area());

		Circle circle1 = new Circle(MyMath.PI);
		Circle circle2 = new Circle(8);
		double area1 = circle1.area();
		double area2 = circle2.area();
		System.out.println("Powierzchnia (promień = PI): " + area1);
		System.out.println("Powierzchnia (promień = 8): " + area2);

		System.out.println(circle1.compare(circle2.getRadius()));
		
		
		System.out.println(MyMath.f(10));

	}

}
