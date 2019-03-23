package innersiniflar;
/*
inner sınıflar sayesinde bi sınıf oluşturup newlememize gerek yok.iç içe sıonıfları oluşturabiliriz.
 */
public class StartApp {

    public static class DiziIslemleri{

        public static void diziYaz(String [] dizi){
            for(String eleman:dizi){
                System.out.println(eleman);
            }
        }

    }

    public static void main(String[] args) {

        Test test=new Test(); //yeni bir sınıf oluşturup sınıftan işlem yapabilmek için newledik.

        String [] dizi={"Merhaba","Java"};
        DiziIslemleri.diziYaz(dizi);

        StartApp.DiziIslemleri.diziYaz(dizi); //static old. için . ile ulaşabiliriz.

    }

}
