package klavyegirdileri;

import java.util.Scanner;

public class KlavyeGirdiApp {
    public static void main(String[] args) {

        /*//scanneri import et. Alt+Enter kısayolu
        // new anahtar sözcüğü classtan nesne oluşturulmasını sağlar.
        * */
        Scanner scanner = new Scanner(System.in);
        // scanner.nextInt();  ınteger değer okuyacağı zaman bu methodu kullanırız.
        // scanner.nextDouble(); double değer okuyacağı zaman be methodu kullanırız.
        //scanner.next();  String değerleri okumak için
        // scanner.nextLine();  String değerleri okumak için. *Tüm satırı okumak için*

        int sayi1,sayi2,sonuc;
        //double sayi3;

        System.out.println("İki sayıyı toplayan program");
        System.out.print("Birinci sayiyi giriniz: ");
        sayi1=scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2=scanner.nextInt();

        sonuc=sayi1+sayi2;
        System.out.println("Toplama işleminizin sonucu:"+sonuc);

        //System.out.println("Girdiğiniz sayı: "+sayi1);

        /*
        System.out.print("Bir sayi giriniz: ");
        sayi3=scanner.nextDouble();
        System.out.println("Girdiğiniz sayı: "+sayi3);
         */





    }
}
