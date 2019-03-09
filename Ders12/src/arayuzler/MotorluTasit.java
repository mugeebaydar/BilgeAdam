package arayuzler;

public interface MotorluTasit {

    public static final int tekerlekSayisi=4;
    boolean motorDurumu=true;

    public abstract void calistir();

    static void tanim(){ //static blokla interfacede kod çalıştırılır!
        System.out.println("Ben bir motorlu taşıtım.");
    }

}
