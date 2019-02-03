package kosulluIfadeler;

import java.util.Scanner;

public class IfYapisiApp {
    public static void main(String[] args) {
        /*int a=5;

        //if parantezleri içersindeki değer true ise blok içerisine girer
        if(a==5){
            System.out.println(a);
            System.out.println("A değişkeni 5'e eşittir.");
        }
        System.out.println("Good bye...");
        */

        Scanner scanner= new Scanner(System.in);
        System.out.print("Bir sayı giriniz ");
        int sayi=scanner.nextInt();

        if(sayi<10){
            System.out.println("Girilen sayı 10'dan küçüktür.");
        }



    }
}
