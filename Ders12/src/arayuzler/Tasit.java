package arayuzler;
//içi dolu methodlar yazılamaz
//interfaceler %100 soyut
public interface Tasit  extends A,B{

    public static final boolean TASIT_DURUMU=true;

    public abstract void hareketEt();
    public abstract void hareketsizKal();

    static void tanim(){
        System.out.println("Ben bir taşıtım.");
    }


}
