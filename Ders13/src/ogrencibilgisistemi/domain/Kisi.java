package ogrencibilgisistemi.domain;

public abstract class Kisi {

    private String ad;
    private String soyad;
    private String dogumTarihi;
    private Long tcNo;
    private String cinsiyet;

    public String getAd(){
        return this.ad;
    }
    public void setAd(String ad){
        this.ad=ad;
    }
    public String getSoyad(){
        return this.soyad;
    }
    public void setSoyad(String soyad){
        this.soyad=soyad;
    }
    public String getDogumTarihi(){
        return this.dogumTarihi=dogumTarihi;
    }
    public void setDogumTarihi(String dogumTarihi){
        this.dogumTarihi=dogumTarihi;
    }
    public Long getTcNo(){
        return this.tcNo=tcNo;
    }
    public void setTcNo(Long tcNo){
        this.tcNo=tcNo;
    }
    public String getCinsiyet(){
        return this.cinsiyet=cinsiyet;
    }
    public void setCinsiyet(String cinsiyet){
        this.cinsiyet=cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", tcNo=" + tcNo +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}

