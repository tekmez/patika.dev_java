import java.util.Scanner;

public class BodyCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter your height (in meters): ");
        float height = inp.nextFloat();
        System.out.print("Please enter your weight: ");
        float weight = inp.nextFloat();
        float index = weight/ (height * height);
        System.out.print("Your Body Mass Index: ");
        System.out.print(index);
    }
}
