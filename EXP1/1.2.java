import java.util.Scanner;
class Minutes{
	public static void main(String args[]){
	System.out.println("NISHTHA BHATT  24CSU352");
	long min;

	System.out.println("enter minutes");
	Scanner scan = new Scanner(System.in);

	long minutesInYear = 525600;
    long minutesInMonth = 43200;
    long minutesInDay = 1440;


	min = scan.nextInt();


	long years = min / minutesInYear;
    long remainingMinutes = min % minutesInYear;

    long months = remainingMinutes / minutesInMonth;
    remainingMinutes %= minutesInMonth;

    long days = remainingMinutes / minutesInDay;


	

	System.out.println(min + "minutes is approx " + years + "years and " + months + "months and " + days + "days"); 


	}
}