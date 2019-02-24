package erisimbelirtecleri;

public class Dikdortgen {
    private double en;
    private double uzunlugu;


    public double getEn(){ //get değer alma
        return this.en;
    }

    public void setEn(double en){ //set değer atama
        this.en=en;
    }

    public double getUzunlugu() {
        return this.uzunlugu;
    }

    public void setUzunlugu(double uzunlugu){
        this.uzunlugu=uzunlugu;
    }


   /* public String toString() { //Stringe çevirme işlemi yapan method
        return "Dikdörtgenin eni: "+this.en+" uzunlugu: "+this.uzunlugu;
    }*/

    @Override //alt+ınsert ile otomatik ekleyebiliriz
    public String toString() {
        return "Dikdortgen{" +
                "en=" + en +
                ", uzunlugu=" + uzunlugu +
                '}';
    }
}

