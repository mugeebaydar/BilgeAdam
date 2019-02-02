package aritmatikoperatorler;

public class AritmatikArtirimApp {
    public static void main (String [] args){

        int a=2,b=7,c=40,d=50;

        a++; //değişkenime ata sonra bir kere artır.
        System.out.println("değişkenime ata sonra bir kere artır: "+a);
        ++b; //Değişkenimi bir kere artır sonra ata.
        System.out.println("Değişkenimi bir kere artır sonra ata: "+b);
        c--; // Değişkenime ata sonra  bir kere azalt.
        System.out.println("Değişkenime ata sonra  bir kere azalt: "+c);
        --d; //Değişkenimi bir kere azalt sonra  ata.
        System.out.println("Değişkenimi bir kere azalt sonra  ata: "+d);

        int x=7,y=7,sonuc1,sonuc2;

        sonuc1 =++x; // 8 çıktısı verir. Önce arttırır sonra atar ve ekrana basar
        sonuc2 =y++; // / çıktısı verir. önce değeri yazar sonra arttırır ekrana değeri yazar henüz arttırmadı.

        System.out.println("Sonuc 1: "+sonuc1);
        System.out.println("Artırımdan sonraki x değeri: "+x);
        System.out.println("Sonuc 2: "+sonuc2);
        System.out.println("Artırımdan sonraki y değeri: "+y);

    }
}
