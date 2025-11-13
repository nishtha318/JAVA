interface P {
    void methodP();
}

interface Q {
    void methodQ();
}

interface R extends P, Q {
    void methodR();
}

class Example implements R {
    public void methodP() {
        System.out.println("Method from interface P");
    }
    public void methodQ() {
        System.out.println("Method from interface Q");
    }
    public void methodR() {
        System.out.println("Method from interface R");
    }
}

class Test1C {
    public static void main(String[] args) {
        Example e = new Example();
        e.methodP();
        e.methodQ();
        e.methodR();
    }
}
