public class Rhombus {
    private double diagonal1;
    private double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of one diagonal: ");
        double diagonal1 = scanner.nextDouble();

        System.out.print("Enter the length of the other diagonal: ");
        double diagonal2 = scanner.nextDouble();

        Rhombus rhombus = new Rhombus(diagonal1, diagonal2);
        System.out.println("Area of the rhombus: " + rhombus.getArea());
        scanner.close();
    }
}