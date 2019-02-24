package passby;

public class StartApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.en = 5; //5değeri ata

        passByValue(dikdortgen);  //
        System.out.println(dikdortgen.en == 5); //değer 6 olarak değiştirildi ama eski objeyi eski değerini refere eder
        //6 atanmış gözükse de değer 5tir. eşit olduğu için true değer döner

    }

    public static void passByValue(Dikdortgen dikdortgen) {

        dikdortgen = new Dikdortgen();
        //yeni objeyi işaret eder default değer atanır 0.0 olarak
        dikdortgen.en = 6; //en'e 6 değerini ata
       // System.out.println(dikdortgen.en == 5);//değer değiştirildiğinde false değer döner ilk atandığı değeri tutar
    }


}
