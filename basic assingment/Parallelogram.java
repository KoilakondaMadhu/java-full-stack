public class Parallelogram {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the length of height: ");
        double height = scanner.nextDouble();

        Parallelogram parallelogram = new Parallelogram(base, height);
        System.out.println("Area of the parallelogram: " + parallelogram.getArea());
        scanner.close();
    }
}