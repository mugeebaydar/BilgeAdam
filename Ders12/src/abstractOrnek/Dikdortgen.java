package abstractOrnek;

public class Dikdortgen extends Sekiller {

    private double en;
    private double boy;

    public Dikdortgen(){

    }
    public Dikdortgen(double en, double boy){
        this.en=en;
        this.boy=boy;
    }
    public void setEn(double en){
        this.en=en;
    }
    public double getEn(){
        return this.en;
    }
    public void setBoy(double boy){
        this.boy=boy;
    }
    public double getBoy(){
        return this.boy;
    }


    @Override
    public double alanHesapla() {

        return (this.boy>0 && this.en>0) ? this.en*this.boy: 0; //ifden else parantez true ile ?den sonra ilk işlemi yap, değilse :den sonra işlemini yap
    }
}
