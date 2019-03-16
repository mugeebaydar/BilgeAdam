package ogrencibilgisistemi.dersler;

public abstract class Ders {
    private String dersAdi;
    private Double katSayisi;
    private Double puan;

    public void setDersAdi(String dersAdi){
        this.dersAdi=dersAdi;
    }
    public String getDersAdi(){
        return this.dersAdi=dersAdi;
    }
    public void setKatSayisi(Double katSayisi){
        this.katSayisi=katSayisi;
    }
    public Double getKatSayisi(){
        return this.katSayisi=katSayisi;
    }
    public void setPuan(Double puan){
        this.puan=puan;
    }
    public Double getPuan(){
        return this.puan=puan;
    }

    @Override
    public String toString() {
        return "Ders{" +
                "dersAdi='" + dersAdi + '\'' +
                ", katSayisi=" + katSayisi +
                ", puan=" + puan +
                '}';
    }
}
