package abstractOrnek;

public class StartApp {
    public static void main(String[] args) {

        Sekiller newSekiller= new Kare(5);
        System.out.println("Kare alanı: "+newSekiller.alanHesapla());

        Sekiller sekiller=new Dikdortgen();
        ((Dikdortgen) sekiller).setEn(5);
        ((Dikdortgen) sekiller).setBoy(10);
        System.out.println("Dikdörtgen alanı: "+sekiller.alanHesapla());

    }
}
