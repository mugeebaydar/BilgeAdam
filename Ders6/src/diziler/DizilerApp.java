package diziler;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DizilerApp {

    public static void main(String[] args) {
        /*int [] dizi =new int[5];
        dizi[0]=5;
        dizi[1]=4;
        dizi[2]=3;
        dizi[3]=2;
        dizi[4]=1;


        System.out.println("Dizinin 0.indisi ve 1.elemanı: "+dizi[0]);
        System.out.println("Dizinin 1.indisi ve 2.elemanı: "+dizi[1]);
        System.out.println("Dizinin 3.indisi ve 3.elemanı: "+dizi[2]);
        System.out.println("Dizinin 4.indisi ve 4.elemanı: "+dizi[3]);
        System.out.println("Dizinin 5.indisi ve 5.elemanı: "+dizi[4]);*/

        /*Dizinin boyutunu aşdığı için ArrayOutOfBoundsException hatası verir.
        dizi[5]=7;
        System.out.println("dizinin 5.indisi: "+dizi[5]);
         */

        //Değer atamadık ama default olarak 0 değerini verir
        /*int [] dizi = new int [5];
        System.out.println("Dizinin 0.indisi ve 1.elemanı "+dizi[0]);
        System.out.println("Dizinin 1.indisi ve 2.elemanı "+dizi[1]);*/

        /*Diziye bir boyut atamazsak eğer, Java bunu JVM'de bulanan heap memory'de oluşturamaz.
          bu yüzden compiler bize dizinin boyutunu belirlememiz için uyarır.
        int [] dizi= new int[];*/

        /*int [] dizi ={5,4,3,2,1};
        System.out.println("Dizinin 0.indisi ve 1.elemanı: "+dizi[0]);
        System.out.println("Dizinin 1.indisi ve 2.elemanı: "+dizi[1]);
        System.out.println("Dizinin 2.indisi ve 3.elamanı: "+dizi[2]);
        System.out.println("Dizinin 3.indisi ve 4.elemanı: "+dizi[3]);
        System.out.println("Dizinin 4.indisi ve 5.elemanı: "+dizi[4]);

        int diziBoyutu=dizi.length; //dizinin boyutunu length ile buluruz
        System.out.println("Dizinin boyutu: "+diziBoyutu);
        System.out.println("Dizinin boyutu: "+dizi.length); //değer atamadan da dizi boyutu bulunur.
        */

        /*int  dizi [] = new int[5];
        System.out.println("Dizinin boyutu: "+dizi.length);

        //dizinin boyutunu değiştirme new keyword ile yapılır.
        dizi= new int [15];
        System.out.println("Dizinin yeni boyutu: "+dizi.length);
        */





    }
}
