package aritmatikoperatorler;

public class AritmatikApp {
    public static void main(String [] args){

        //Değişken isimleri birbirinden farklı olmalıdır.

        int a=7,c=3,d;
        int b=3;
        int sonuc;
        double  bolmeSonucu,x=7;

        sonuc = a+b;
        System.out.println("Toplama İşlemi: "+sonuc);
        sonuc = a-b;
        System.out.println("Çıkarma İşlemi: "+sonuc);
        sonuc =a*b;
        System.out.println("Çarpma İşlemi: "+sonuc);
        sonuc = a/b;
        System.out.println("Integer Bölme İşlemi: "+sonuc);
        bolmeSonucu =x/b;
        System.out.println("Double Bölme İşlemi: "+bolmeSonucu);
        sonuc = a%b;
        System.out.println("Mod Alma İşlemi: "+sonuc);

        a=a+b;
        System.out.println("Normal atama: "+a);
        a=7;
        a+=b; //topla ve ata
        System.out.println("Aritmatik atama: "+a);

        a=7;
        a=a-b;
        System.out.println("Normal atama: "+a);
        a=7;
        a-=b;
        System.out.println("Aritmatik Atama: "+a);

        a=7;
        a*=b;
        System.out.println("Artimatik atama ve çarpma: "+a);
        a=7;
        a%=b;
        System.out.println("Aritmatik atama ve mod alma: "+a);
        a=7;
        a/=b;
        System.out.println("Aritmatik atama ve bölme işlemi: "+a);


    }
}
