interface X {
    void methodX();
}

interface Y extends X {
    void methodY();
}

class Demo implements Y {
    public void methodX() {
        System.out.println("Method from interface X");
    }
    public void methodY() {
        System.out.println("Method from interface Y");
    }
}

class Test1B {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodX();
        d.methodY();
    }
}
