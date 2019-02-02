package aritmatikoperatorler;

public class IliskiselKarsilastirmaApp {
    public static void main (String [] args){
         //psvm yazınca public statici otamatik yazar.

        int a=5,b=10;

        //< , <=, >, >=, ==, !=

        boolean sonuc;
        sonuc= a<b;
        System.out.println("A'nın B'den küçük olma durumu: "+sonuc);
        System.out.println(a<b); //boolean değerler döner.
        sonuc=a>b;
        System.out.println("A'nın B'den büyük olma durumu: "+sonuc);
        sonuc= a<=b;
        System.out.println("A'nın B'den küçük eşit olma durumu: "+sonuc);
        int c=5;
        sonuc= a<=c;
        System.out.println("A'nın C'den küçük olma durumu: "+sonuc);
        sonuc= a>=b;
        System.out.println("A'nın B'den büyük olma durumu: "+sonuc);
        sonuc = a==b;
        System.out.println("A'nın B'ye eşit olma durumu: "+sonuc);
        sonuc= a==c;
        System.out.println("A'nın C'ye eşit olma durumu: "+sonuc);
        sonuc= a!=b;
        System.out.println("A'nın B'ye eşit olmama durumu: "+sonuc);

    }
}
