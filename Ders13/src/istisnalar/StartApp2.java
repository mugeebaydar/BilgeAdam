package istisnalar;

public class StartApp2 {
    public static void main(String[] args) {
        int [] dizi=new int[3];
        dizi[0]=3;
        dizi[1]=5;
        dizi[2]=7;

        try{
            diziElemani(dizi);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Dizi elemanını yanlış yerde arıyorsun.");
        }
    }
    public static void diziElemani(int [] dizi){
        System.out.println(dizi[3]); //exception nesne oluşturulur ve bu satırda try-catch bloğu var mı diye bakar. yoksa
        //bir üst metoda gider try-catch bloğu arar. varsa ekrana catch kısmını basar

    }
}
