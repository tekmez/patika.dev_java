import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;
        Scanner inp = new Scanner(System.in);
        System.out.println("How Many Kilos of Pears");
        double kgPear = inp.nextDouble();
        System.out.println("How Many Kilos of Apple");
        double kgApple = inp.nextDouble();
        System.out.println("How Many Kilos of Tomato");
        double kgTomato= inp.nextDouble();
        System.out.println("How Many Kilos of Banana");
        double kgBanana = inp.nextDouble();
        System.out.println("How Many Kilos of Eggplant");
        double kgEggplant = inp.nextDouble();
        double sumPear = kgPear * pear;
        double sumApple = kgApple * apple;
        double sumTomato = kgTomato * tomato;
        double sumBanana = kgBanana *banana;
        double sumEggplant = kgEggplant * eggplant;
        double result = sumApple+sumBanana+sumEggplant+sumPear+sumTomato;
        System.out.print("Total amount: ");
        System.out.println(result);
    }
}
