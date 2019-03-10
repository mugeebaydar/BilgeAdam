package istisnalar;

public class StartApp3 {
    public static void main(String[] args) {
        int yas=30;
        try{
            getYas(yas);
        }catch (IllegalStateException exception){
            System.out.println("Yaş değeri sıfırdan küçük olamaz.");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Dizinin elamanını yanlış yerde arıyorsun");
        }catch (NumberFormatException ex){
            System.out.println("Sayı uygun değil");
        }catch(Exception ex){
            System.out.println("Super exceptiona yakalandınız");
        }
        finally {
            System.out.println("son olarak burayı çalıştır");
            //catchten sonra yazılır her durumda çalışır
        }
        System.out.println("Kod çalışıyor mu?");
    }
    //throws'la hangi hatayı vereceğini belirtilir. throwla farkı budur. birden fazla hata eklenebilir
    public static int getYas(int yas) throws IllegalStateException,NumberFormatException{
        if(yas<0){
            //throw kendi oluşturduğumuz hatalarda kullanılır.
            IllegalStateException istisna=new IllegalStateException();
            throw istisna;
        }else if(yas>0){
            NumberFormatException istisna=new NumberFormatException();
            throw istisna; //throwdan sonra return kullanılmaz. ex fırlatır ve return döndürür bu yüzdne kullanılmaz
        }
        return yas;
    }
}
