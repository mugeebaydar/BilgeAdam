package arayuzler;

public class StartApp {
    public static void main(String[] args) {

        System.out.println("Motorlu taşıt oluşturuluyor.");
        MotorluTasit motorluTasit = new Araba();
       // Tasit tasit = new Araba();

        System.out.println("Taşıt durumu: " + Tasit.TASIT_DURUMU);
        Tasit.tanim();

        System.out.println("Motor durumu: "+MotorluTasit.motorDurumu);
        System.out.println("Tekerlek sayisi: "+MotorluTasit.tekerlekSayisi);
        motorluTasit.calistir();
        ((Araba) motorluTasit).hareketEt();
        ((Araba) motorluTasit).hareketsizKal();

        System.out.println("Motorsuz taşıt oluşturuluyor");
        MotorsuzTasit motorsuzTasit=new Bisiklet();
        System.out.println("Taşıt durumu: "+Tasit.TASIT_DURUMU);
        Tasit.tanim();
        System.out.println("Motor durumu: "+MotorsuzTasit.motorDurumu);
        System.out.println("Tekerlek sayisi: "+MotorsuzTasit.tekerlerSayisi);
        motorsuzTasit.sur();;
        ((Bisiklet) motorsuzTasit).hareketEt();
        ((Bisiklet) motorsuzTasit).hareketsizKal();



    }
}
