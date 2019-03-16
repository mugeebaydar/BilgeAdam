package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DosyaYazma {
    public static void main(String[] args) {

        File file = new File("C:\\DosyaIslemleri\\deneme.txt"); //dosya okuma,veri kaydetmek için file kullanılır. pathname'de yolunu belirler

        System.out.println(file.exists());

        if (file.exists()) { //exits dosyanın var olup olmadıhı kontrol eder
            PrintWriter yazici = null;
            try {
                yazici = new PrintWriter(file); //try bloğu içinde tanımlarsak finallyde kapatamayız. global tanımladık burada newledik

                yazici.write("Merhaba Java.");


                //throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace(); //hatanın ne olduğunu gösteriri
                System.out.println("Dosya bulunamadı.");
            } finally {
                yazici.close();
            }

            System.out.println("Dosyamız mevcuttur.");
        }


    }
}
