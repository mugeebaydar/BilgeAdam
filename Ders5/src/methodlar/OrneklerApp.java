package methodlar;

public class OrneklerApp {

    public static void main(String[] args) {

        helloMethod();
        sayiYaz(50);
        int sonuc=10+20;
        sayiYaz(sonuc);
        sayiYaz(1+2+3);
        toplamaIslemi(5,3);
        int gelenDeger=donusTipiOlanToplamaIslemi(7,2);
        System.out.println("Dönüş tipi olan toplama işlemi: "+gelenDeger);

        int result=donusTipiOlanToplamaIslemi(3,6)+1;
        System.out.println("sonuc: "+result);

    }


    //return tipi olmayan ve parametre almayan method
    // static olmasının sebebi static methodtan çağırabilmek için.
    public static void helloMethod(){
        System.out.println("Hello Method..");
    }

    //return tipi olmayan ve parametre ALAN method
    public static void sayiYaz(int sayi){
        System.out.println("sayınız: "+sayi);
    }

    //return tipi olmayan ve birden fazla parametre alan method
    public static void toplamaIslemi( int sayi1, int sayi2){

        int sonuc=sayi1+sayi2;
        System.out.println("İki sayının toplamı: "+sonuc);
    }

    public static int donusTipiOlanToplamaIslemi(int sayi1,int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;

    }

}
