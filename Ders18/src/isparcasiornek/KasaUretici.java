package isparcasiornek;

public class KasaUretici extends Thread {
    private Depo depo;

    public KasaUretici() {

    }

    public KasaUretici(Depo depo) {
        super("KasaUreticisi");
        this.depo = depo;
    }

    @Override
    public void run() {
        while (true) {
            try {

                sleep(1500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            depo.put();
        }


    }
}
