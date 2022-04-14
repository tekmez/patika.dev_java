import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        System.out.println("Please enter money");
        Scanner inp = new Scanner(System.in);
        double money = inp.nextFloat();
        System.out.print("Your Money: ");
        System.out.println(money);
        System.out.print("With Kdv: ");
        double kdv = ((money >= 1000) ? (money + (money*0.18) ): (money + (money*0.08)));
        System.out.println(kdv);
        String kdvPercent = (money >= 1000) ? "0.18" : "0.08";
        System.out.print("Kdv Percent: ");
        System.out.println(kdvPercent);
    }
}
