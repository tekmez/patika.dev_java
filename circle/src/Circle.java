import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.println("enter r");
        float r = inp.nextFloat();
        System.out.println("enter a degree");
        float degree = inp.nextFloat();
        float area = (float) ((pi * (r*r) * degree) / 360);
        System.out.print("Area of circle: ");
        System.out.println(area);
    }
}
