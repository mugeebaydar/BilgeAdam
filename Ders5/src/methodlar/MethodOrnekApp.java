package methodlar;

import java.util.Scanner;

public class MethodOrnekApp {
    public static void main(String[] args) {

        System.out.println("4 İşlem yapan programa hoşgeldiniz");
        System.out.print("İlk değeri giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi1=input.nextInt();

        System.out.print("İkinci değeri giriniz: ");
        int sayi2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1-) Toplama İşlemi" + " 2-) Çıkarma İşlemi " + " 3-)Bölme İşlemi " + "4-)Çarpma işlemi ");
        int secenek=input.nextInt();

        switch (secenek){
            case 1:
                System.out.println("Toplama İşlemi: "+toplamaIslemi(sayi1,sayi2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi: "+cikarmaIslemi(sayi1,sayi2));
                break;
            case 3:
                System.out.println("Bölme İşlemi: "+bolmeIslemi(sayi1,sayi2));
                break;
            case 4:
                System.out.println("Carpma İşlemi: "+carpmaIslemi(sayi1,sayi2));
                break;
            default:
                System.out.println("Yapılacak işlem seçeneğinin dışında bir değer girdiniz.");
                break;
        }

    }

    public static int toplamaIslemi (int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;
    }

    public static int cikarmaIslemi(int sayi1, int sayi2){
        int sonuc;
        if(sayi1>sayi2){
            sonuc=sayi1-sayi2;
        }
        else{
            sonuc=sayi2-sayi1;
        }
        return sonuc;
    }

    public static float bolmeIslemi (float sayi1, float sayi2){
        float sonuc;
        if(sayi1>sayi2){
            sonuc=sayi1/sayi2;
        }
        else{
            sonuc=sayi2/sayi1;
        }
        return sonuc;
    }

    public static float carpmaIslemi (float sayi1, float sayi2){
        float sonuc=sayi1*sayi2;
        return sonuc;
    }




}
