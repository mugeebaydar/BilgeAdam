package kalitim2;

public class Ogrenci extends Kisi{ //extends ile kalitim yapilir
    private long okulNumarasi;

    public Ogrenci(){

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
