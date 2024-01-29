public class New {
    public double length;
    public double width;

    public New() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("INVALID LENGTH");
        }
    }

    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("INVALID WIDTH");
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension < 20.0;
    }

    public static void main(String[] args) {
        New n = new New();
        n.setLength(-5);
        n.setWidth(-10);

        // You can now proceed with any calculations or operations on n
        double area = n.calculateArea();
        double perimeter = n.calculatePerimeter();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
