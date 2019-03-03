package cokbicimlilik; //bir nesnenin başka bir nesne gibi davranmasına cokbicimlilik denir

public class StartApp {
    public static void main(String[] args) {

        Sekiller sekiller = new Sekiller();
       // System.out.println(sekiller.alanHesapla()); //sekiller sınıfındaki return değerini 0 tanımladık. 0 değeri basar

        Dikdortgen dikdortgen=new Dikdortgen();
        dikdortgen.setEn(5);
        dikdortgen.setBoy(6);
        //System.out.println("Dikgortgen alanı: "+dikdortgen.alanHesapla());

        Kare kare=new Kare();
        kare.setKenar(3);
       // System.out.println("Karenin alanı: "+kare.alanHesapla());

        sekillerinAlaniniHesapla(sekiller);
        sekillerinAlaniniHesapla(dikdortgen);
        sekillerinAlaniniHesapla(kare);

        Daire daire=new Daire();
        sekillerinAlaniniHesapla(daire);

        sekillerinCevresiniHesapla(sekiller);
        sekillerinCevresiniHesapla(dikdortgen);
        sekillerinCevresiniHesapla(kare);
        sekillerinCevresiniHesapla(daire); //çıktısı 0. sebebi çevre hespalayı override etmedik super classındaki değeri yazdırdı
        //override yaptığımızda override kısmındakş işlemin çıktısı verir
    }


        public static void sekillerinAlaniniHesapla(Sekiller sekiller){
            System.out.println("Şeklin alanı: "+sekiller.alanHesapla());
        }

        public static void sekillerinCevresiniHesapla(Sekiller sekiller){
            System.out.println("Şeklin çevresi: "+sekiller.cevreHesapla());
        }




}
