package nesne;

public class StartApp5 {
    public static void main(String[] args) {

        System.out.println(Dikdortgen.sayi); //0 çıktısı

        Dikdortgen.sayi=5;
        System.out.println(Dikdortgen.sayi); //5 çıktısı

        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println("sayinin son değeri: "+dikdortgen.sayi); //5 çıktısı her zaman son atanan değeri ekrana yazar.

        dikdortgen.sayi=10;
        System.out.println("sayının değer atanış hali: "+dikdortgen.sayi);

    }
}
