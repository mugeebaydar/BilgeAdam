package dosyaislemleri.nesneyazma;

import java.io.*;

public class NesneOku {
    private static final String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {
        ObjectInputStream objectInputStream=null; //nesne okumak için input

        File file=new File(ROOT,"personel.ser");

        Personel personel=null;

        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);

            while(true){ //verile sürekli okumak için while kullanılır. ex alırız sonsuz döngüye girer. bi süre sonra ex atacak catchte yakalarız while durdururuz. eofe ile
                personel= (Personel) objectInputStream.readObject();
                System.out.println(personel);
            }
            //buraya kod yazılmaz. catch bloğunda return yazdık. returnden sonraki komutlar satırlar yazdırılımaz.
            //yazılacaksa while bloğunda yazdırılmalıdır.

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamamıştır.");
        } catch (ClassNotFoundException e) {
            System.out.println("Personel sınıfı bulunamadı.");
        } catch (EOFException e){

            return; //tekrark dön dediğimizde file'ı dolaylı yoldan kapatır. whilw sonsuz döngüsünü çözmüş oluruz
        }
        catch (IOException e) {
            System.out.println("Dosya okuma sırasında hata meydana geldi.");
        }finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Personelin adı: "+personel.getAd()); //buraya yazarsak ekranda görürüz. return yazdığımız için sonraki kodlar çalışmaz
            System.out.println("Personel soyadı: "+personel.getSoyad());
        }


    }

}
