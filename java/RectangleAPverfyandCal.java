public class RectangleAPverfyandCal {
    private double length;
    private double width;

    // Default constructor
    public RectangleAPverfyandCal() {
        this.length = 0.0;
        this.width = 0.0;
    }

    // Getter and setter for length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (isValidDimension(length)) {
            this.length = length;
        } else {
            System.out.println("Invalid length. It should be a floating-point number larger than 0.0 and less than 20.0");
        }
    }

    // Getter and setter for width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (isValidDimension(width)) {
            this.width = width;
        } else {
            System.out.println("Invalid width. It should be a floating-point number larger than 0.0 and less than 20.0");
        }
    }

    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Helper method to validate dimensions
    private boolean isValidDimension(double dimension) {
        return dimension > 0.0 && dimension < 20.0;
    }

    public static void main(String[] args) {
        RectangleAPverfyandCal rectangle = new RectangleAPverfyandCal();

        // Setting valid dimensions
        rectangle.setLength(5.0);
        rectangle.setWidth(8.0);

        // Getting and printing dimensions, perimeter, and area
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());

        // Setting invalid dimensions
        rectangle.setLength(25.0); // Should print an error message
        rectangle.setWidth(-5.0);  // Should print an error message
    }
}

