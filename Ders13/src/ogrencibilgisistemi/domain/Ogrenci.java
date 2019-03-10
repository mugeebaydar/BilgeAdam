package ogrencibilgisistemi.domain;

import ogrencibilgisistemi.dersler.Ders;

import java.util.ArrayList;

public class Ogrenci extends Kisi {
    private Long okulNumarasi;
    private Double notOrtalamasi;
    private Integer dersSayisi;
    private ArrayList<Ders> dersListesi; //dizi veritipinde dizi halinde kompozisyon yapıldı. alakalı şeyleri birbirleriyle kullanma
    private boolean dersDurumu;



    public Ogrenci(){

    }
    public Ogrenci(Long okulNumarasi,Double notOrtalamasi,Integer dersSayisi){
        this.okulNumarasi=okulNumarasi;
        this.notOrtalamasi=notOrtalamasi;
        this.dersSayisi=dersSayisi;
    }
    public void setOkulNumarasi(Long okulNumarasi){
        this.okulNumarasi=okulNumarasi;
    }
    public Long getOkulNumarasi(){
        return this.okulNumarasi;
    }
    public boolean isDersDurumu() { //boolean veri tipinde get yerine is yazılır
        return dersDurumu;
    }

    public void setDersDurumu(boolean DersDurumu) {
        this.dersDurumu = dersDurumu;
    }

    public void setNotOrtalamasi(Double notOrtalamasi){
        this.notOrtalamasi=notOrtalamasi;
    }
    public Double getNotOrtalamasi(){
        return this.notOrtalamasi=notOrtalamasi;
    }
    public void setDersSayisi(Integer dersSayisi){
        this.dersSayisi=dersSayisi;
    }
    public Integer getDersSayisi(){
        return this.dersSayisi=dersSayisi;
    }
    public void setDersListesi(ArrayList<Ders> dersListesi){
        this.dersListesi=dersListesi;
    }
    public ArrayList<Ders> getDersListesi(){
        return this.dersListesi=dersListesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNumarasi=" + okulNumarasi +
                ", notOrtalamasi=" + notOrtalamasi +
                ", dersSayisi=" + dersSayisi +
                ", dersListesi=" + dersListesi +
                ", dersDurumu=" + dersDurumu +
                "} " + super.toString();
    }
}
