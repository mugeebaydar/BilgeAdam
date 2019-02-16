package ikiboyutludiziler;

public class IkiBoyutluDiziApp {
    public static void main(String[] args) {

        int satir = 3, sutun = 4;
        int sayac = 0;

        int[][] dizi = new int[satir][sutun];

        System.out.println("Dizinin boyutu: " + dizi.length);
        System.out.println("Dizinin sutun boyutu: " + dizi[0].length);

        for (int i = 0; i < dizi.length; i++) { //satır için for

            for (int k = 0; k < dizi[i].length; k++) { //sütun için for

                dizi[i][k] = ++sayac;
            }
        }

        for (int i = 0; i < dizi.length; i++) { //dizi boyutu kadar yazdırmak için döngü

            //her bir satırdaki sutun sayısına erişebilmek için dizi[i].length kullanılır.
            for (int k = 0; k < dizi[i].length; k++) {
                System.out.print(dizi[i][k] + " ");
            }
            System.out.println();
        }

    }
}
