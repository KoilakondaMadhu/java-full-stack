public class StudentMarks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;
    private double subject5;
    private double subject6;

    public StudentMarks(double subject1, double subject2, double subject3, double subject4, double subject5, double subject6) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
        this.subject6 = subject6;
    }

    public double getTotalMarks() {
        return subject1 + subject2 + subject3 + subject4 + subject5 + subject6;
    }

    public double getAverage() {
        return getTotalMarks() / 6;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        double subject1 = scanner.nextDouble();

        System.out.print("Enter marks for subject 2: ");
        double subject2 = scanner.nextDouble();

        System.out.print("Enter marks for subject 3: ");
        double subject3 = scanner.nextDouble();

        System.out.print("Enter marks for subject 4: ");
        double subject4 = scanner.nextDouble();

        System.out.print("Enter marks for subject 5: ");
        double subject5 = scanner.nextDouble();

        System.out.print("Enter marks for subject 6: ");
        double subject6 = scanner.nextDouble();

        StudentMarks studentMarks = new StudentMarks(subject1, subject2, subject3, subject4, subject5, subject6);
        System.out.println("Total marks: " + studentMarks.getTotalMarks());
        System.out.println("Average marks: " + studentMarks.getAverage());

        scanner.close();
    }
}