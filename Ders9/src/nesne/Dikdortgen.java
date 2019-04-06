package nesne; //sınıfın hangi pakette olduğunu belirtir.

//sınıfa import edilen sınıflar burada belirtilir
public class Dikdortgen {

    /*
    * Sınıf içerisinde verilen değişkenler sınıf değişkenleridir.
    * O sınıfın özellikleridir (properties)
    * */

    public double uzunlugu;
    public double en;
    public double cevre;
    public double alan;
    //public Double a=new Double(0);

    public static int sayi; //staticle nesne new keywordunu kullanmadan bu class üzerinden çalıştır

    public static final double PI=3.14;


    //Sadece class ismi verilir. Dönüş tüpü yoktur.
    public Dikdortgen() {
        //this keyword ile class değişkenlerinden bahsediyor olacağız.
        //this.uzunlugu = 5; //this = bu classta demek
        //this.en = 6;
        //uzunlugu=5;
        //en=6;
    }

    public Dikdortgen(int uzunlugu, int en){
        this.uzunlugu=uzunlugu;
        this.en=en; //parametreden gelen ve classtan gelenleri this ile ayırt etme. this kullanılmak zorunda!!
    }

    public void alanHesapla(){
        this.alan=this.en*this.uzunlugu;
        System.out.println("Dikdörtgenimin alanı: "+this.alan);
    }

    //aynı isimde parametre olan davranış oluşturduk. Override işlemi
    public void alanHesapla(double uzunlugu, double en){
        double sonuc=uzunlugu*en;
        System.out.println("parametre alan dikdötgenin alan hesabı:"+sonuc);
    }

    public double alanHesapla(double alan){
        return alan;
    }

    public void cevreHesapla(){
        this.cevre=(2*this.en)+(2*this.uzunlugu);
        System.out.println("Dikdörtgenimin çevresi: "+cevre);
    }



}
