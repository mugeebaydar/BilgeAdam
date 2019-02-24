package kalitim2;

public class Kisi {
    private String ad;
    private String soyad;
    private int yas;

    public Kisi(){

    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad=soyad;
        this.yas=yas;
    }


    public String kisiBlgileri(){ //override edilebilecek method
        return "Adi: "+this.ad+" Soyadi: "+this.soyad+" yasi:"+this.yas;
    }


    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }

    public String getsoyad(){
        return this.soyad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }

    public int getYas(){
        return this.yas;
    }
    public void setYas(int yas){
        this.yas=yas;
    }
}
