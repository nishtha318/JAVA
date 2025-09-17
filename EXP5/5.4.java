import java.util.Scanner;


class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike");
    }
}

class Vehilces{
    public static void main(String[] args) {
        System.out.println("NISHTHA BHATT , 24CSU352");
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();

        Vehicle v; 

    
        if (N == 2) {
            v = new Bike();
        } else if (N == 4) {
            v = new Car();
        } else {
            v = new Vehicle();
        }

        
        v.display();


        sc.close();
    }
}
