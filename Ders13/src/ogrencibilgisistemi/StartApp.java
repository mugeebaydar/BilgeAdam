package ogrencibilgisistemi;

import ogrencibilgisistemi.dersler.Ders;
import ogrencibilgisistemi.dersler.Fizik;
import ogrencibilgisistemi.dersler.Matematik;
import ogrencibilgisistemi.domain.Ogrenci;
import ogrencibilgisistemi.service.BilgiSistemi;
import ogrencibilgisistemi.service.BilgiSistemiArayuz;

import java.util.ArrayList;

public class StartApp {
    public static void main(String[] args) {
        BilgiSistemiArayuz bilgiSistemi=new BilgiSistemi(); //methodları çağırmak için bilgiSistemi nesnesini oluşturduk.

        Ders matematik=new Matematik();
        matematik.setDersAdi("Matematik");
        matematik.setKatSayisi(3.0);
        matematik.setPuan(50.0);

        Ders fizik=new Fizik();
        fizik.setDersAdi("Fizik");
        fizik.setKatSayisi(2.0);
        fizik.setPuan(20.0);

        bilgiSistemi.dersKaydet(matematik);
        bilgiSistemi.dersKaydet(fizik);

        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setAd("Ali");
        ogrenci.setSoyad("Yılmaz");
        ogrenci.setCinsiyet("Erkek");
        ogrenci.setDogumTarihi("01/01/1989");
        ogrenci.setTcNo(1234567890L);
        ogrenci.setDersSayisi(2);
        ogrenci.setOkulNumarasi(536L);
        ArrayList<Ders> aldigiDersler=bilgiSistemi.dersListesiGetir();
        ogrenci.setDersListesi(aldigiDersler);

        double notOrtalamasi=bilgiSistemi.notHesapla(ogrenci);
        ogrenci.setNotOrtalamasi(notOrtalamasi);
        System.out.println("Öğrencinin not ortalaması: "+ogrenci.getNotOrtalamasi());

        boolean sinifGecmeDurumu=bilgiSistemi.dersDurumunaBak(ogrenci);
        ogrenci.setDersDurumu(sinifGecmeDurumu);
        System.out.println("Öğrencinin geçme durumu: "+ogrenci.isDersDurumu());

        bilgiSistemi.ogrenciKaydet(ogrenci);

        ArrayList<Ogrenci> ogrenciListesi=bilgiSistemi.ogrenciListesiGetir();
        ArrayList<Ders> dersListesi=bilgiSistemi.dersListesiGetir();

        System.out.println("Öğrenci Listesi: ");
        bilgiSistemi.ogrenciListesiYaz(ogrenciListesi);
        System.out.println();
        System.out.println("Öğrencinin ders Listesi: ");
        bilgiSistemi.dersListesiYaz(dersListesi);








    }
}
