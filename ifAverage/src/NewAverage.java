import java.util.Scanner;

public class NewAverage {
    public static void main(String[] args) {
        int mat, fiz, turk, kimya, muzik;
        String yanlis = "notunuz 0 ile 100 arasında olmalı, notunuzu tekrardan girin";
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Mat notunu giriniz");
        mat = inp.nextInt();
        if (mat < 0 || mat > 100) {
            System.out.println(yanlis);
            mat = inp.nextInt();
        }
        System.out.println("Fizik notunu giriniz");
        fiz = inp.nextInt();
        if (fiz < 0 || fiz > 100) {
            System.out.println(yanlis);
            fiz = inp.nextInt();
        }
        System.out.println("Turkce notunu giriniz");
        turk = inp.nextInt();
        if (turk < 0 || turk > 100) {
            System.out.println(yanlis);
            turk = inp.nextInt();
        }
        System.out.println("Kimya notunu giriniz");
        kimya = inp.nextInt();
        if (kimya < 0 || kimya  > 100){
            System.out.println(yanlis);
            kimya = inp.nextInt();
        }

        System.out.println("muzik notunu giriniz");
        muzik = inp.nextInt();
        if (muzik < 0 || muzik > 100) {
            System.out.println(yanlis);
            muzik = inp.nextInt();
        }
        double ortalama = (mat + fiz + turk + kimya + muzik)/5;
        String durum = (ortalama >= 55) ? "Geçtiniz" : "kaldiniz";
        System.out.println(durum);
    }
}
