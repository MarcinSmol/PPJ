package ppj_1;

public class Circle {
	private double radius = 0.0;

	int compare(double radius) {
		if (this.radius < radius) {
			return -1;
		} else if (this.radius > radius) {
			return 1;
		}
		return 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 3.141592 * radius * radius;

	}

	public Circle(double radius) {
		this.radius = radius;
	}

}