interface A {
    void showA();
}

interface B {
    void showB();
}

class Parent {
    void displayParent() {
        System.out.println("This is the parent class");
    }
}

class Child extends Parent implements A, B {
    public void showA() {
        System.out.println("Interface A implemented");
    }

    public void showB() {
        System.out.println("Interface B implemented");
    }
}

class Test1A {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayParent();
        obj.showA();
        obj.showB();
    }
}
