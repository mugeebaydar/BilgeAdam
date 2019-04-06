package dosyaislemleri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DosyaOkuma {
    public static void main(String[] args) {
        File file = new File("C:\\DosyaIslemleri\\deneme.txt");
        if (file.exists()) {

            Scanner okuma = null;
            try {
                okuma = new Scanner(file);

                while (okuma.hasNext()) { //hasnext ++ işlemi yapar. obje aldığımız için byte byte okunur.

                    System.out.print(okuma.next());
                }

            } catch (FileNotFoundException e) {
                System.out.println("Dosya bulunamamıştır.");
                System.exit(1); //dosyayı tamamen kapatmak için kullanılır.
            } finally {
                okuma.close();
            }
        } else{
            System.out.println("Dosya bulunamamıştır.");
        }

    }
}
