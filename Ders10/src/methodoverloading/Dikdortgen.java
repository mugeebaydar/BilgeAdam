package methodoverloading;

public class Dikdortgen {

    public double en;
    public double uzunlugu;
    public double alan;
    public double cevre;


    public void alanHesapla(){
        this.alan=this.en*this.uzunlugu;
        System.out.println("Dikdörtgenin alanı: "+alan);
    }

    public void alanHesapla(final double en, final double uzunlugu){
        this.alan=en*uzunlugu;
        System.out.println("Dikdörtgenin alanı: "+this.alan);
    }

    public void alanHesapla(double en, double uzunlugu,double cevre){
        this.alan=en*uzunlugu;
        System.out.println("Dikdötgenin alanı: "+alan);
        System.out.println("Dikdörtgenin çevresi: "+cevre);
    }

    public double alanHesapla(double alan){
        return alan;
    }
}
