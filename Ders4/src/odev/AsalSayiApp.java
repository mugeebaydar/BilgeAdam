package odev;

import java.util.Scanner;
public class AsalSayiApp {
    public static void main(String[] args) {

        //Klavyeden girilen sayınınasal olup olmadığını bulan program.
        /*Scanner input=new Scanner(System.in);
        System.out.println("Klavyeden girilen sayının asal olup olmadığını bulan program");
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();

        if (sayi==2){
            System.out.println("Asal sayı: "+sayi);
        } else if( sayi%sayi==0 && sayi %1==0 && sayi%2==1){
            System.out.println("Asal sayı: "+sayi);
        } else{
            System.out.println("Asal sayı değildir: "+sayi);
        }
        System.out.println("Güle güle");
        */

        // For ile asal sayıyı bulan program // Forla yapılma amacı 1'e ve kendine bölünebilmesi!
        /*System.out.println("ASAL SAYILARI BULAN PROGRAM");
        Scanner girilenDeger=new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int deger=girilenDeger.nextInt();
        int arttirma=0;

        for(int i=1; i<=deger; i++){
            if(deger%i==0){ //Kendine bölünebilme
                arttirma +=1;
            }
        }
        if(arttirma==2){
            System.out.println("Girdiğiniz değer ASAL SAYIDIR: "+deger);
        }else{
            System.out.println("Girdiğiniz değer ASAL SAYI DEĞİLDİR: "+deger);
        }

        System.out.println("Güle güle :)");
        */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi1=scanner.nextInt();

        if(sayi1>1){

            boolean asalMiDegilMi=false; //flag

            for(int i=2; i<sayi1; i++){

                if(sayi1%i==0){
                    asalMiDegilMi=true;
                }
            }

            if(asalMiDegilMi){
                System.out.println("Sayı asal değildir.");
            }else{
                System.out.println("Sayı asaldır.");
            }
        }

    }
}
