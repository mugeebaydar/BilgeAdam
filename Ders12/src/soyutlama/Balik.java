package soyutlama;

public class Balik extends Hayvan {
   /* public Balik(){

    }

    public Balik(int a){
        super(1);
    }*/

    @Override
    public void yemek() {
        System.out.println("Ben deniz ürünlerim yerim.");
    }

    @Override
    public void hareketEt() {
        System.out.println("Ben yüzerim.");
    }

    @Override
    public void tanim() {
        System.out.println("Ben bir balığım ve hayvan sınıfınınn alt sınıfıyım");
    }
}
