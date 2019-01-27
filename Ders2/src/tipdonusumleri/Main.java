package tipdonusumleri;

public class Main {

    public static void main (String [] args){

        /*Tip dönüşümleri genelde küçükten büyüğe doğru olur.
        Dikkat etmemiz gereken büyükten küçüğe doğru tip dönüşümleri.
        Aksi taktir de veri kaybı yaşanabilir.

        // ctrl+shift+/ satırı commet alır
        // tekli commet

        /*
        çoklu commet
         */

        byte bytea = 127;
        int intb;

        intb = bytea; //byte'dan int'e atamada sorun yok

        intb = 127;
        bytea = (byte) intb;//cast yapılması gerekir
        System.out.println("Maximum boyutu geçmediği tip dönüşümü: "+bytea);

        intb = 256;
        bytea = (byte) intb;
        System.out.println("Maximum boyutu geçtiğin de tip dönüşümü: "+bytea);

        Integer xInt=12;
        String xString;
        xString=xInt.toString(); //toString intten strige veri tipi çevirmede kullanılır.
        System.out.println(xString);



    }
}
