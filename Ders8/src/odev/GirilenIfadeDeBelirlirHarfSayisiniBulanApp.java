package odev;

import java.util.Scanner;

public class GirilenIfadeDeBelirlirHarfSayisiniBulanApp {
    public static void main(String[] args) {
        //kullanıcı ilk olarak bir string ifade girecek
        //sonrasında bir harf girecek
        //program girilen harf sayısını o ifade içerisinde bulacak

        Scanner input=new Scanner (System.in);
        System.out.print("Bir string ifade giriniz: ");
        String ifade=input.nextLine(); //Ard arda bir string ifade girilirken nextLine ilk kullanılmalıdır.
        ifade=ifade.toLowerCase();
        System.out.print("Harf giriniz: ");
        String harf=input.next();
        harf=harf.toLowerCase();


        /*girileni diziye çevir boyutu kadar döngü oluştur
        *karakter arama ve ekrana yazma
        * girilen harfi ifade de arama if() eğer varsa ekrana su kadar diye yazdır
        *
        * */

        System.out.println("Girilen harf sayısından şu kadar vardır.");

    }
}
