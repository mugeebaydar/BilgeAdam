package interfacesiniflar;

//birden fazla implments edilebilir. ilk implementsten sonra virgülle ekleyebiliriz
public  class Dikdortgen implements DikdortgenInterface,DikdortgenInterface2 {
    @Override
    public double alanHesapla() {
        return 0;
    }

    @Override
    public double cevreHesapla() {
        return 0;
    }
}
