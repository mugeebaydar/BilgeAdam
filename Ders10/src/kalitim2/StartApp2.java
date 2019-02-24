package kalitim2;

public class StartApp2 {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setOkulNumarasi(123);
        System.out.println(ogrenci.kisiBlgileri()); //super ile ogrenci classında ad soyad yas değerlerini gönderdik
    }
}
