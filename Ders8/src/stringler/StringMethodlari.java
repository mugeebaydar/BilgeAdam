package stringler;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringMethodlari {
    public static void main(String[] args) {

        String deger = "Merhaba Java";
        System.out.println("Tüm karakterleri büyük harf yapar: " + deger.toUpperCase());
        System.out.println("karakterleri küçük harfe çevirir: " + deger.toLowerCase());

        //Stringler final classla oluşturulduğu için değiştirme işlemi yapamayız
        deger.toLowerCase();
        System.out.println(deger);

        //yeniden değer ataması yapılıyor gibi olur sonra değiştirilmesi mümkün olur
        //deger=deger.toLowerCase();
        System.out.println(deger);

        System.out.println(deger.charAt(1)); //char c={'j','a','v','a'}; bu şekilde algılar. İndislerle ifade edlir.0dan başlar

        System.out.println(deger.indexOf("J")); //Yazılan karakterin indeksini gösterir
        System.out.println(deger.indexOf('a'));
        System.out.println(deger.lastIndexOf('a')); // birden fazla aynı karakterdeki en sondaki karakteri alır

        //verilen indis numarasından başlayp geri kalan tüm ifadeti getirir verilen indis numarası da dahil!!!!!
        System.out.println(deger.substring(8));

        //ilk  verilen indis. (5.indisten başla 7.elemana kadar al 7 dahil )
        System.out.println(deger.substring(5, 7)); //iki aralık belirleriz.(eleman sayısı olarak düşün.indisle karıştırılıyor)

        System.out.println(deger.concat(" Naber")); //Değer toplama-birleştirme
        System.out.println(deger + " Naber");

        System.out.println(deger.replace('a', 'o')); //karakterleri değiştirme

        //Bu varsa bu kurala göre bunu yap.
        System.out.println(deger.replaceAll(" ", "")); //regex varsa oraya replacement yap.
        System.out.println(deger.replaceAll("", " ")); //boşluk olmayan yerlere boşluk koy

        String bosluk = " Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim()); //sağ ve soldaki boşluğu siler

        String adSoyad="Ramazan Karagöz";
        String ad="";
        String soyad="";
        int boslukDeger=adSoyad.indexOf(" "); //boşluğun indisini belirleme

        System.out.println("bosluk deger: "+boslukDeger);
        ad=adSoyad.substring(0,boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);//boşluk değerinden sonrakini dahil et +1 ile

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyad);

        System.out.println("char array kullanımı: ");
        char [] dizi=deger.toCharArray();

        for(char c:dizi){
            System.out.println(c);
        }

        String a="12";
        //ilkel tipe dönüştürmek içni parseInt() methodu kullanılır
        int sayi=Integer.parseInt(a);
        System.out.println(sayi);
        //(Wrapper) Nesne tipe dönüştürmek için valueOf() methodu kullanılır.
        Integer sayi2=Integer.valueOf(a); //oje kitinde ınteger tipinde çevirir.

        //primitive tipleri String veri tipine dönüştürmek için valueOf kullanılır.
        String stringSayi=String.valueOf(sayi);
        String stringSayi2=sayi2.toString();

        //(Wrapper) Nesne tipindeki bir değeri stringe çeirmek için valueOf kullanılabilir.
        //String.ValueOf methodu Object turunden nesne aldığı için
        //Java da tüm nesneler Object sınıfından türer.
        String asa=String.valueOf(sayi2);


        double doubleSayi=Double.parseDouble(a);
        System.out.println(doubleSayi);


    }

}
