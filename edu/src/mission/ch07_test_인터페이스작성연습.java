package mission;

class Triangle implements Shape {
	private int x1, y1, x2, y2, x3, y3;

	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	public double perimeter() {
		double ab, bc, ca;
		ab = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		bc = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
		ca = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
		double sum = ab+bc+ca;
		return sum;
		}

	public double area() {
		double sum = 0;
		sum = (((x1*y2) + (x2*y3) + (x3*y1)) - ((x1*y3) + (x2*y1) + (x3*y2)))/2;
		return sum;
	}
}

class Rectangle implements Shape {
	int x1, y1, x2, y2;

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public double perimeter() {
		double length = 0.0;
		length = Math.abs(x2-x1) + Math.abs(y2-y1);
		return length*2;
	}

	public double area() {
		double sum = 0;
		sum = Math.abs((x2-x1) * (y2-y1));
		return sum;
	}
}

class Square implements Shape {
	int x1, y1;
	int side;

	public Square(int x1, int y1, int side) {
		this.x1 = x1;
		this.y1 = y1;
		this.side = side;
	}

	public double perimeter() {
		return side * 4;
		
	}

	public double area() {
		return side * side;
	}
}

public class ch07_test_인터페이스작성연습 {
	public static void main(String[] args) {
		Shape t = new Triangle(1, 2, 3, 4, 5, 6);
		Shape r = new Rectangle(1, 2, 3, 4);
		Shape s = new Square(1, 2, 3);
		System.out.println("삼각형 둘레 길이 = " + t.perimeter());
		System.out.println("삼각형 면적 = " + t.area());
		System.out.println("사각형 둘레 길이 = " + r.perimeter());
		System.out.println("사각형 면적 = " + r.area());
		System.out.println("정사각형 둘레 길이 = " + s.perimeter());
		System.out.println("정사각형 면저 = " + s.area());
	}
}
