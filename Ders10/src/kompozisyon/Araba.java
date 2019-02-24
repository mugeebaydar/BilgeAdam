package kompozisyon;

public class Araba {
    private Motor motor; //alakalı nesneyi kullanarak kompozisyon yaptık. ilgili nesneleri birleştirdik gibi düşünülebilir

    public Araba() {
        motor=new Motor(); //araba nesnesi oluşturduğumda motor nesnesi oluştur (yapılandırıcı method)
    }

    public void hareketZamani(){
        motor.motoruCalistir();
        System.out.println("Araba harekete geçti...");
    }

    public void durmaZamani(){
        motor.motoruDurdur();
        System.out.println("Araba hareketsiz durumda.");
    }

}
