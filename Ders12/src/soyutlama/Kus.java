package soyutlama;

public class Kus extends Hayvan {
    @Override
    public void yemek() {
        System.out.println("Ben kuş yemi ile beslenirim.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Ben kanatlarım ile uçarım.");
    }

    @Override
    public void tanim() {
        System.out.println("Ben bir kuşum ve hayvan sınıfının alt sınıfıyım");
    }
}
