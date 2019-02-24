package kalitim2;

public class Ogrenci extends Kisi{ //extends ile kalitim yapilir
    private long okulNumarasi;

    public Ogrenci(){
        //superden önce alt sınıfa değer atanmaz.
        //once super sınıfın objesinin oluşturulması gerekir
        //this.okulNumarasi=12;
        super("ramazan","karagoz",27); //super keywordü ile üst sınıfa değerler gönderebiliriz.
        super.setAd("fdsfg");
        super.setYas(12); //ekranda bu değerler yazar. en son esane edilen değeri baz alır java!

    }
    public long getOkulNumarasi(){
        return okulNumarasi;
    }
    public void setOkulNumarasi(long okulNumarasi){
        this.okulNumarasi=okulNumarasi;
    }

    @Override //CTRL+O override edilecek bilgiler seçilir
    public String kisiBlgileri() {
        return "Öğrenci bilgisi: "+super.kisiBlgileri()+" Okul Numarasi: "+this.okulNumarasi; //super keywordü ile üst classtaki bilgilere erişebiliriz
    }


}
