public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimeter() {
        return 4 * sideLength;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
        Square square = new Square(sideLength);
        System.out.println("Area of the square: " + square.getArea());
        System.out.println("Perimeter of the square: " + square.getPerimeter());
        scanner.close();
    }
}