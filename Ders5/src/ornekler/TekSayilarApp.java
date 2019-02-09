package ornekler;

public class TekSayilarApp {
    public static void main(String[] args) {

        //1den 100e kadar olan tek sayıları ekrana basma

        String tekSayilar = "";

        for(int i=0; i<=100; i++){
            if(i%2==1){
                tekSayilar+=i+" "; //boşluk bırakarak değerleri yazdırır

            }
        }
        System.out.println("1den 100e kadar olan sayilar:"+tekSayilar);
       
        

    }
}
