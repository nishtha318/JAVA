class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle rCircle = new ResizableCircle(10.0);
        System.out.println("Original radius area: " + rCircle.getArea());
        System.out.println("Original perimeter: " + rCircle.getPerimeter());

        rCircle.resize(50);
        System.out.println("\nAfter resizing by 50%:");
        System.out.println("New radius area: " + rCircle.getArea());
        System.out.println("New perimeter: " + rCircle.getPerimeter());
    }
}
