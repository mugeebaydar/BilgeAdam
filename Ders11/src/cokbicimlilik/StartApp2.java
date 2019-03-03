package cokbicimlilik;

public class StartApp2 {
    public static void main(String[] args) {
        Sekiller sekiller=new Sekiller();
        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        Kare kare=new Kare();
        kare.setKenar(10);

        //sekillerinAlaniniHesapla(sekiller);
        Kisi kisi= new Kisi();

        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);
        sekillerinAlaniniHesapla(kisi);

    }

    //cokbicimlilik olmasaydı objeleri karsışlatırmak gerekirdi. ve kontrol etmek gerekir
    public static void sekillerinAlaniniHesapla(Object nesne){
        /*if(nesne instanceof Sekiller){ //instanceof iki nesneyi karsılaştırır
            Sekiller sekiller=(Sekiller) nesne; //tip dönüşümü yaptık //alt+enter ile cast işlemi seçilebilir
            System.out.println("Şekiller nesnesinin alanı: "+sekiller.alanHesapla());
        }*/


        //Soldaki obje sağdaki obje midir?
        if(nesne instanceof  Dikdortgen){
            Dikdortgen dikdortgen= (Dikdortgen) nesne;
            System.out.println("Dikdörtgenin alanı: "+dikdortgen.alanHesapla());
        }else if(nesne instanceof Kare){
            Kare kare= (Kare)nesne;
            System.out.println("Karenin alanı: "+kare.alanHesapla());
        }
        else{
            System.out.println("Bu bir şekil değildir.");
        }
    }
}
