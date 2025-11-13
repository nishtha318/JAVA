class B extends Marks {
    private double m1, m2, m3, m4;

    public B(double m1, double m2, double m3, double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    @Override
    double getPercentage() {
        return (m1 + m2 + m3 + m4) / 4.0;
    }
}
