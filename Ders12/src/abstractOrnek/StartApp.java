package abstractOrnek;

import java.util.ArrayList;
import java.util.Iterator;

public class StartApp {
    public static void main(String[] args) {

        Sekiller kare = new Kare(5);
        System.out.println("Kare alanı: " + kare.alanHesapla());

        Sekiller dikdortgen = new Dikdortgen();
        ((Dikdortgen) dikdortgen).setEn(5);
        ((Dikdortgen) dikdortgen).setBoy(10);
        System.out.println("Dikdörtgen alanı: " + dikdortgen.alanHesapla());


        ArrayList<Sekiller> sekillerList = new ArrayList<>();
        sekillerList.add(dikdortgen);
        sekillerList.add(kare);

        genisletilebilirlilik(sekillerList);
        System.out.println("Kare objesi çıkarılıyor..");
        sekillerList.remove(kare);
        genisletilebilirlilik(sekillerList);

        Sekiller kare1 = new Kare(3);
        Sekiller kare2 = new Kare(0);
        Sekiller dikdortgen1 = new Dikdortgen(2, 7);
        Sekiller dikdortgen2 = new Dikdortgen(0, 0);


        sekillerList.add(kare1);
        sekillerList.add(kare2);
        sekillerList.add(dikdortgen1);
        sekillerList.add(dikdortgen2);
        System.out.println("Yeni sekiller eklendi...");
        genisletilebilirlilik(sekillerList);

        System.out.println("Alanı 0dan büyük olan şekiller.");

        ArrayList<Sekiller> donenListe = new ArrayList<>();
        donenListe = alaniSifirdanBuyukOlanSekillerIteratorIleKullanimi(sekillerList); //donenliste değişkenine alanisıfı.. methodunu atadık değişken olarak sekillerListi atadı
        genisletilebilirlilik(donenListe); //genisl. ile ekrana yazdırıyoruz

    }

    public static void genisletilebilirlilik(ArrayList<Sekiller> sekiller) {

        System.out.println("Genişletebilirlilik methodu:");
        if (sekiller.size() > 0) {
            for (Sekiller sekil : sekiller) {
                System.out.println("Şeklin alanı: " + sekil.alanHesapla());
            }
        }
    }

    public static ArrayList<Sekiller> alaniSifirdanBuyukOlanSekiller(ArrayList<Sekiller> sekillerArrayList) {

        System.out.println("Alanlari sıfırıa eşit olan nesneleri silen method.");
        if (sekillerArrayList.size() > 0) {
            for (Sekiller sekil : sekillerArrayList) {
                if (sekil.alanHesapla() == 0) {
                    sekillerArrayList.remove(sekil);
                }
            }
        }
        return sekillerArrayList;
    }

    public static ArrayList<Sekiller> alaniSifirdanBuyukOlanSekillerIteratorIleKullanimi(ArrayList<Sekiller> sekillerArrayList) {

        //iteratorler threadlerle senkron sekilde çalışır ve sıkıntı çıkarmaz. ilk thread gider işinin hallerder işini bittiğini diğeri gider
        //bu yüzden hata almayız. (depo  örneği iki kişi var birisi taşıyor diğeri de taşıyor)(iterator depo ile birisi gidiyor o dönmeden diğeri
        // kutu taşıyamıyor. o yüzden karışıklık olmaz.)
        System.out.println("Alanlari sıfırıa eşit olan nesneleri silen method.");
        if (sekillerArrayList.size() > 0) {
            Iterator yineleme = sekillerArrayList.iterator(); //arraylistemi iteratoruma dönüştürdüm
            synchronized (sekillerArrayList) {};
            for(;yineleme.hasNext();){ //hasNext dediğimizde bir sonraki objeyi alır iterator kullanımı bu şekildir. ++ işlemini yapar

                Sekiller sekil=(Sekiller) yineleme.next();  //next o anki döndüğü değer kullanılır.

                if(sekil.alanHesapla()==0){
                    yineleme.remove();
                }
            }
            /*while (yineleme.hasNext()) {
                Sekiller sekiller = (Sekiller) yineleme.next();
                yineleme.next();
            }*/
        }
        return sekillerArrayList;
    }
}
