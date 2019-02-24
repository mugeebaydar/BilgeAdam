package passby;

public class StartApp2 {

    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.en=5;

        passByReferance(dikdortgen);
        System.out.println(dikdortgen.en==5); //10 olduğu için 5e değil false değeri döner

    }
    public static void passByReferance (Dikdortgen dikdortgen){
        dikdortgen.en=10; //en değerini 10 yapar
    }

}
