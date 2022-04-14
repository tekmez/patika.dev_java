import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grade average calculation.");
        System.out.println("Please enter a math grade !");
        int math = input.nextInt();
        System.out.println("Please enter a physics grade !");
        int pyhsics = input.nextInt();
        System.out.println("Please enter a chemical grade !");
        int chemical = input.nextInt();
        System.out.println("Please enter a english grade !");
        int english = input.nextInt();
        System.out.println("Please enter a history grade !");
        int history = input.nextInt();
        System.out.println("Please enter a music grade !");
        int music = input.nextInt();
        float sum = math + pyhsics + chemical + english + history + music;
        float average = sum / 6;
        System.out.print("Your grade average is : ");
        System.out.println(average);
        String passed = (average >= 60) ? "Passed" : "failed";
        System.out.print(passed);
    }
}
