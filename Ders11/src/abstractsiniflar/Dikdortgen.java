package abstractsiniflar;

public class Dikdortgen extends Sekiller{

    private double en;
    private double boy;

    public Dikdortgen(){

    }

    public Dikdortgen(double en, double boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override  //KISAYOL: CTRL+I yaparak ekleyebiliriz
    public double alanHesapla() {
        return this.en*this.boy;
    }

    @Override
    public double cevreHesapla() {
        return 2*this.en+2*this.boy;
    }

    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
