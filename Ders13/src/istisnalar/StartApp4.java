package istisnalar;

public class StartApp4 {
    public static void main(String[] args) {
        boolean deger = true;


        try {
            getDeger(deger);
        } catch (BilgeAdamException exception) {
            System.out.println(exception.getMessage());
            //exception.printStackTrace(); //exceptionun bilgilerini gösterir
            System.out.println(exception.getCause());
        }finally {
            System.out.println("son olarak burası çalışır");
        }
        System.out.println("kod satırı buradan devam eder");


    }

    public static void getDeger(boolean deger) throws BilgeAdamException {
        if (deger) {
            BilgeAdamException istisna = new BilgeAdamException("Ben bilgeadam istisnasıyım.");
            throw istisna;
        }
    }
}
