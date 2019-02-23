package odev;

import java.util.Scanner;

public class DiziMerdivenApp {
    public static void main(String[] args) {

        //kare bir dizi olarak 4x4 (satır ve sutun sayısı eşit olacak)
        //Kullanıcı dizinin boyutunu girecek ve merdiven şeklinde aşağıdaki şekli oluşturacak
        //Dizinin satır ve sutun sayılarını kontrol ederek yap
        //iç içe for
        //dizi[i][k]='x';

        /*
             X
            XX
           XXX
          XXXX

          X
         XX
        XXX
       XXXX
      XXXXX
        * */

        /*int[][] dizi2d = new int[4][];
        //iki boyutlu dizinin her satırını dizi olarak gösterme/görme
        dizi2d[0] = new int[5];
        dizi2d[1] = new int[5];
        dizi2d[2] = new int[5];
        dizi2d[3] = new int[5];
        System.out.println(dizi2d.length);
        System.out.println("sutun boyutu: " + dizi2d[0].length);*/

        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutu giriniz: ");
        int diziBoyutu = input.nextInt();

        char [][] dizi = new char[diziBoyutu][diziBoyutu];
        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int k = 0; k < dizi[0].length; k++) {
                if (i + k+2 > dizi.length) {
                    dizi[i][k] ='x';
                } else {
                    dizi[i][k] = ' ';
                }

            }

        }
        for(int i=0; i<dizi.length; i++){
            for(int k=0; k<dizi[0].length; k++){
                System.out.print(dizi[i][k]+ " ");
            }
            System.out.println();
        }

    }
}
