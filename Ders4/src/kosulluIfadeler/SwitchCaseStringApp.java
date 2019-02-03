package kosulluIfadeler;

import java.util.Scanner;

public class SwitchCaseStringApp {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Hangi gün haftanın kaçıncı günü:  ");
        String haftaninGunu=input.next(); //next string değişkenleri okur

        switch (haftaninGunu){
            case "pazartesi":
                System.out.println("Haftanı 1. günüdür.");
                break;
            case "salı":
                System.out.println("Haftanı 2. günüdür.");
                break;
            case "çarşamba":
                System.out.println("haftanın 3. günüdür.");
                 break;
            case "perşembe":
                System.out.println("haftanın 4. günüdür.");
                break;
            case "cuma":
                System.out.println("haftanın 5. günüdür.");
                break;
            case "cumartesi":
                System.out.println("haftanın 6. günüdür.");
                break;
            case "pazar":
                System.out.println("haftanın 7.günüdür.");
                break;
            default:
                System.out.println("Yanlış ifade girdiniz.");
        }
    }
}
