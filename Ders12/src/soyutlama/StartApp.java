package soyutlama;

public class StartApp {
    public static void main(String[] args) {

        Hayvan hayvan=new Balik(); //polymorphism
        hayvan.tanim();
        hayvan.hareketEt();
        hayvan.yemek();

        Hayvan newHayvan=new Kus();
        newHayvan.tanim();
        newHayvan.hareketEt();
        newHayvan.yemek();


    }
}
