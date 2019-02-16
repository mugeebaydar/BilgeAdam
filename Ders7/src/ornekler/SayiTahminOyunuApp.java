package ornekler;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunuApp {
    public static void main(String[] args) {
        //Kullanıcının 1 ile 10 arasında girdiği sayıyı programın belirlediği rasgele sayı ile eşleştiren
        //sayının 2 eksiğine ve 2 fazlasına yaklaştığında yaklaştınız uyarısı veren yaklaşamadığında kullanıcıya
        //yaklaşamadınız diye uyarı veren sayıyı bulduğunda kazandınız yazan bir uygulama yazınız.

        Scanner input = new Scanner(System.in);
        int sayi = (int) (Math.random() * 10);
        int girilenSayi;
        boolean devamEdilsinMi=false;

        do {

            System.out.print("1 ile 10 arasında bir değer giriniz: ");
            girilenSayi = input.nextInt();

            if (girilenSayi == sayi) {
                System.out.println("Sayıyı buldunuz! :)" + sayi);
            } else if (girilenSayi == sayi - 1 || girilenSayi == sayi + 1) {
                System.out.println("yaklaştınız: ");
            } else if (girilenSayi == sayi - 2 || girilenSayi == sayi + 2) {
                System.out.println("Yaklaştınız");

            } else {
                System.out.println("Tekrar deneyiniz...");
            }

        } while (devamEdilsinMi);



    }
}
