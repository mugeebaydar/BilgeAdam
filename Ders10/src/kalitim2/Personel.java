package kalitim2;

public class Personel extends Kisi{
    private long sicilNumarasi;

    public Personel(){

    }

    public long getSicilNumarasi(){
        return sicilNumarasi;
    }
    public void setSicilNumarasi(long sicilNumarasi){
        this.sicilNumarasi=sicilNumarasi;
    }

    @Override
    public String kisiBlgileri() {
        return "Personel Bilgileri: "+super.kisiBlgileri()+" Sicil Numarasi: "+this.sicilNumarasi; //super keywordü ile üst classtaki bilgilere erişebiliriz
    }


}
