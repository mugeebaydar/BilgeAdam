package abstractOrnek;

public class Kare extends Sekiller {

    private double kenarUzunlugu;
    public Kare(){

    }
    public Kare(double kenarUzunlugu){
        this.kenarUzunlugu=kenarUzunlugu;
    }
    public double getKenarUzunlugu(){
        return this.kenarUzunlugu;
    }
    public void setKenarUzunlugu(double kenarUzunlugu){
        this.kenarUzunlugu=kenarUzunlugu;
    }

    @Override
    public double alanHesapla() {

        if(this.kenarUzunlugu>0){
            return Math.pow(this.kenarUzunlugu,2); //kütüphane kullanarak alan hesapla, kenaruzunluğunun 2 üssünü al
        }
        else{ //else yazılmasa da olur zaten return döndürecek
            return 0;
        }


    }
}
