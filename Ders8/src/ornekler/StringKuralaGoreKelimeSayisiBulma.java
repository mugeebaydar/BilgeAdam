package ornekler;

import java.util.Scanner;

public class StringKuralaGoreKelimeSayisiBulma {
    public static void main(String[] args) {

        //Camel Case girilen string bir cümledeki kelime sayısı bulma
        //Camel Case string kullanıcı tarafından girilecek
        //String deger = "stringIfadeleriGetirenMethod";

        Scanner input = new Scanner(System.in);
        System.out.print("Kelime sayısını bulmak istediğiniz camel case ifade giriniz:  ");
        String deger = input.next();

        int sayac=1; //1den başlamasının sebebi baştaki kelime

        char [] dizi=deger.toCharArray();
        String temp="";

        for(int i=0; i<dizi.length; i++){
            temp=String.valueOf(dizi[i]);
            if(temp.equals(temp.toUpperCase())){
                sayac++;
            }

        }
        System.out.println("Girilen kelime sayısı: "+sayac);


    }
}
