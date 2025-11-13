class A extends Marks {
    private double m1, m2, m3;

    public A(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    double getPercentage() {
        return (m1 + m2 + m3) / 3.0;
    }
}
