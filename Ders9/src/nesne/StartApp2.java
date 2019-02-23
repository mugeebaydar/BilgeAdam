package nesne;

public class StartApp2 {
    public static void main(String[] args) {

        Dikdortgen dikdortgen1 = new Dikdortgen();
        dikdortgen1.alan = 5;
        System.out.println("Dikdörtgen1 alanı: " + dikdortgen1.alan);

        Dikdortgen dikdortgen2 = new Dikdortgen();

        /*dikdörtgen1 artık dikdortgen2'nin heap'de oluşturduğu yeni objeyi
        (örneklendirme/instance) refer ettiği için, refer ettiğin örneklendirmenin değerlerini alır.
        dikdortgen1'in önceden refer ettiği örneklendirme, gc tarafından yok edilir. (Destroy edilir.)
        */
        dikdortgen1 = dikdortgen2; //heapte d1 d2ye eşitlenir bu yüzden d2nin değerlerini alır.
        System.out.println("Dikdörtgen1 alanı: " + dikdortgen1.alan); //0.0 değerini ekrana yazar
        dikdortgen1.alan = 6;
        System.out.println("Dikdörtgen1 alanı: " + dikdortgen1.alan);


    }
}
