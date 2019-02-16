package ornekler;

import java.util.Scanner;

public class SayiTahminApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rastgeleUretilenSayi = (int) (Math.random() * 10);
        int tahmin = 0;
        boolean devamEdilsinMi = true;

        System.out.println("uretilen sayi: "+rastgeleUretilenSayi);

        do {
            System.out.print("bir tahmin de bulunun: ");
            tahmin=input.nextInt();

            if (tahmin == rastgeleUretilenSayi + 2 || tahmin == rastgeleUretilenSayi - 2) {
                System.out.println("Yaklaştınız...");
            } else if (tahmin == rastgeleUretilenSayi + 1 || tahmin == rastgeleUretilenSayi - 1) {
                System.out.println("Yaklaştınız...");
            } else if (tahmin == rastgeleUretilenSayi) {
                System.out.println("Kazandınız tebrikler...");
                devamEdilsinMi = false;
            } else {
                System.out.println("Yaklaşamadınız...");
            }

        } while (devamEdilsinMi);
    }
}
