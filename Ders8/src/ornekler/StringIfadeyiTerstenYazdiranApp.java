package ornekler;


public class StringIfadeyiTerstenYazdiranApp {
    public static void main(String[] args) {

        String deger = "Merhaba Java"; //avaJ abahreM
        //System.out.println(deger.replaceAll("Merhaba Java", "avaJ abahreM"));

        String sonuc = "";
        char[] dizi = deger.toCharArray();

        for (int i = dizi.length - 1; i >= 0; i--) {
            sonuc+=dizi[i];
        }
        System.out.println(sonuc);

    }
}
