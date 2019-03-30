package isparcasiornek;

public class Magaza1 extends Thread {
    private Depo monitorDepo;
    private Depo klavyeMouseDepo;
    private Depo kasaDepo;
    public Magaza1(){

    }
    public Magaza1(Depo monitorDepo,Depo klavyeMouseDepo,Depo kasaDepo){
        super("Magaza1");
        this.monitorDepo=monitorDepo;
        this.klavyeMouseDepo=klavyeMouseDepo;
        this.kasaDepo=kasaDepo;
    }

    @Override
    public void run() {
        //işparçacığı her seferinde 1500 ms uyku moduna geçiyor daha sonra kaldığı yerden devam ediyor.
        //wh,le true old. i.in bu işlemi tekrar tekrar yapıyor.
        while(true){
            try{

                sleep(3000);

            } catch (InterruptedException e){
                e.printStackTrace();
            }
            //Thread 3000 ms bekle süresi bittikten sonra depo nesnelerinde get methodu yardımıyla miktarı 1 azaltıyor
            monitorDepo.get();
            klavyeMouseDepo.get();
            kasaDepo.get();
        }


    }
}
