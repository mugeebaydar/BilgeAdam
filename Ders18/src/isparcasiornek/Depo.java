package isparcasiornek;

public class Depo  {

    private String name;
    private int miktar;

    public Depo(){

    }

    public Depo(String name){
        this.name=name;
    }

    public synchronized void get(){

        while(miktar==0){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        miktar--;
        System.out.println(Thread.currentThread().getName()+" alıyor: "+miktar); //current o anda çalışan methodu döndürür

        //Ureticilerin beklememesi için not,fy methodu çağrılıyor.
        //Nofity methodu o an ki threadin kilidinin açılmasını sağlar. Serbest bırakır.
        notify(); //ürün alınırken sende ürün koy. put methodu wait

    }

    public synchronized void put(){
        while(miktar==5){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        miktar++;
        System.out.println(Thread.currentThread().getName()+" koyuyor: "+miktar);
        notify(); //get mthodunun waitinin kilidi açtırır

    }

    @Override
    public String toString() {
        return this.name+" : "+this.miktar;
    }
}
