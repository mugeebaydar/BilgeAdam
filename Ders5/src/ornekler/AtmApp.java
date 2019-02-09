package ornekler;

import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {

        int secenek=0;
        String sifre="1234";
        String girilenSifre="";
        int bakiye=1_000_000;
        int cekilecekMiktar=0;
        boolean devamEdilsinMi=false;

        Scanner input=new Scanner(System.in);

        do{
            System.out.println("Hoşgeldiniz..");
            System.out.print("Şifrenizi Giriniz: ");
            girilenSifre=input.next();

            if(girilenSifre.equals(sifre)){

                System.out.println("Hangi işlemi yapmak istiyorsunuz?");
                System.out.println("1-) Para Çek");
                System.out.println("0-)Çıkış");
                System.out.print("Seçiniz: ");
                secenek=input.nextInt();

                if(secenek>=0 && secenek<=1){
                  switch (secenek){
                    case 0:
                        System.out.println("Yine Bekleriz");
                        devamEdilsinMi=false;
                        break;
                    case 1:
                        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                        cekilecekMiktar=input.nextInt();
                        if(cekilecekMiktar<=bakiye){
                            bakiye=bakiye-cekilecekMiktar;
                            System.out.println("Paranız Çekiliyor");
                            System.out.println("Kalan Miktar: "+bakiye +" TL");
                            System.out.println("Güle güle :)");
                            devamEdilsinMi=true;
                        }
                        else{
                            System.out.println("Yetersiz bakiye..");
                            devamEdilsinMi=false;
                        }
                  }
                }
                else{
                    System.out.println("Yanlış seçenek..");
                }
            }else{
                System.out.println("Yanlış şifre girdiniz..");
            }

        }while(devamEdilsinMi);

    }
}
