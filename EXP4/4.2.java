import java.util.Scanner;
class Triangle {
	int a , b , c;
	Triangle(){
	 a = 3;
	 b = 4;
	 c = 5;
	}

	int getPerimeter(){
	return a+b+c ;
	}

	double getArea(){
	 return 0.5 * a * b ;
	}

	public static void main(String[] args){
		System.out.println("NISHTHA BHATT , 24CSU352");

	Triangle t = new Triangle();

	System.out.println("Perimeter of triangle: " + t.getPerimeter());
	System.out.println("AREA :" + t.getArea());
	}
                                               
}