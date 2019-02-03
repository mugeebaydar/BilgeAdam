package kosulluIfadeler;

import java.util.Scanner;

public class IfThenElseApp {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Bir değer giriniz: ");
        int sayi=input.nextInt();

        String cevap=(sayi>5)? "Girilen değer 5'ten büyüktür." : "Girilen değer 5'den küçüktür";

        //tek koşullu bir ifade kullanılacaksa If Then Else durumu kullanılır.

        System.out.println(cevap);

    }
}
