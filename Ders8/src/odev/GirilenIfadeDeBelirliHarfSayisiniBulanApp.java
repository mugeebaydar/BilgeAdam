package odev;

import java.util.Scanner;

public class GirilenIfadeDeBelirliHarfSayisiniBulanApp {
    public static void main(String[] args) {
        //kullanıcı ilk olarak bir string ifade girecek
        //sonrasında bir harf girecek
        //program girilen harf sayısını o ifade içerisinde bulacak

        Scanner input = new Scanner(System.in);
        System.out.print("Bir string ifade giriniz: ");
        String ifade = input.nextLine(); //Ard arda bir string ifade girilirken nextLine ilk kullanılmalıdır.
        ifade = ifade.toLowerCase();
        System.out.print("Harf giriniz: ");
        String harf = input.next();
        harf = harf.toLowerCase();

        if(ifade.length()>0){

            char [] karakterler=ifade.toCharArray();
            int sayac=0;

            for(char karakter:karakterler){

                String a=String.valueOf(karakter);
                if(a.equals(harf)){
                    sayac++;
                }
               /*
               if(String.valueOf(karakter).equals(harf)){}
                */
            }
            System.out.println("Girilen harf sayısı: "+sayac);


        }else{
            System.out.println("bir string ifade girmeniz gerekmektedir.");
        }

    }
}
