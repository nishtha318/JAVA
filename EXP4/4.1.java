import java.util.Scanner;
class Student {
	String name;
	int roll_no;
}
class StudentTest{
	public static void main(String[]args) {
		System.out.println("NISHTHA BHATT , 24CSU352");

		Student s1 = new Student();

		 s1.name = "john";
		 s1.roll_no = 2 ;

		 System.out.println("NEME : " +s1.name);
		 System.out.println("ROLL NUMBER : " +s1.roll_no);

	}
}