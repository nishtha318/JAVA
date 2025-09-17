class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

class MainClass {
    public static void main(String[] args) {
        System.out.println("NISHTHA BHATT , 24CSU352");

        Square sq = new Square();
        
        sq.printShape();
        sq.printRectangle();
        sq.printSquare();
    }
}
