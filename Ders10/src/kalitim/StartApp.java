package kalitim;

public class StartApp {
    public static void main(String[] args) {
        Personel personel=new Personel("ramazan","karagöz",27,123);

        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setAd("ali");
        ogrenci.setSoyad("yılmaz");
        ogrenci.setYas(12);
        ogrenci.setOkulNumarasi(456);

        System.out.println(personel.toString());
        System.out.println(ogrenci.toString());
    }
}
