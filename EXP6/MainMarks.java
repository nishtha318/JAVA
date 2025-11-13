public class MainMarks {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 80);
        B studentB = new B(78, 82, 88, 91);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
