package kalitim2;

public class StartApp {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setAd("Ali");
        ogrenci.setSoyad("Yılmaz");
        ogrenci.setYas(12);
        ogrenci.setOkulNumarasi(536);

        System.out.println(ogrenci.kisiBlgileri());

        Personel personel=new Personel();
        personel.setAd("Veli");
        personel.setSoyad("Yılmaz");
        personel.setYas(30);
        personel.setSicilNumarasi(1221345);

        System.out.println(personel.kisiBlgileri());

    }
}
