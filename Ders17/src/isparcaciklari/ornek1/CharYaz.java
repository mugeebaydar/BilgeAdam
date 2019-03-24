package isparcaciklari.ornek1;

public class CharYaz implements Runnable {

    private char karakter;
    private int yazmaSayisi;
    private int i;

    public CharYaz() {

    }

    public CharYaz(char karakter, int yazmaSayisi) {
        this.karakter = karakter;
        this.yazmaSayisi = yazmaSayisi;

    }

    @Override
    public void run() {
        try {
            for (i = 0; i < yazmaSayisi; i++) {
                if (i == 1) {
                    //Thread.sleep(5000);
                    Thread.yield(); //thread duruyor daha sonra diğer thread çalışıyor. senkron
                }
            }
        } catch(Exception e){
            System.out.println(e);
        }
        System.out.print(karakter);

    }
}
