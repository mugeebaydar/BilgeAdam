package isparcasiornek;

public class KlavyeMouseUretici extends Thread {
    private Depo depo;
    public KlavyeMouseUretici(){

    }
    public KlavyeMouseUretici(Depo depo){
        super("KlavyeMouseUreticisi");
        this.depo=depo;
    }

    @Override
    public void run() {

        //işparçacığı her seferinde 1500 ms uyku moduna geçiyor daha sonra kaldığı yerden devam ediyor.
        //wh,le true old. i.in bu işlemi tekrar tekrar yapıyor.
        while (true){
            try{

                sleep(1500);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //depodaki ürün miktarını seknron ir şekilde 1 artırıyor.
            depo.put();
        }


    }
}
