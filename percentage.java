import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter marks for subject1: ");
        double subject1 = input.nextDouble();

        System.out.print("Enter marks for subject2: ");
        double subject2 = input.nextDouble();

        System.out.print("Enter marks for subject3: ");
        double subject3 = input.nextDouble();

        System.out.print("Enter marks for subject4: ");
        double subject4 = input.nextDouble();

        System.out.print("Enter marks for subject5: ");
        double subject5 = input.nextDouble();

        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
        double percentage = (totalMarks / 500) * 100; 

        
        System.out.println("Percentage: " + percentage + "%");

        
        input.close();
    }
}
