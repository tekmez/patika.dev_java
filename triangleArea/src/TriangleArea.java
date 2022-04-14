import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("enter the perimeter of the triangle");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        int perimeter = (a+b+c)/2;
        System.out.print("perimeter of triangle: ");
        System.out.println(perimeter);
        int area = perimeter * ( perimeter - a)* ( perimeter - b)* ( perimeter - c);
        System.out.print("area of triangle: ");
        System.out.println(area);
    }
}
