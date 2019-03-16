package dosyaislemleri;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.IOException;

public class FileIslemleri {

    private static final String ROOT = "C:\\DosyaIslemleri";

    public static void main(String[] args) {

        File file = new File(ROOT);

        if (file.isFile()) { //file bir dosya mı
            System.out.println("Bu uzantısı olan bir dosyadır.");
        } else if (file.isDirectory()) { //file bir klasör mü?
            System.out.println("Bu bir klasördür.");
            System.out.println("Klasörün ismi: " + file.getName());
            System.out.println("Bir önceki klasör: " + file.getParent());
            System.out.println("Klasörün uzantısı: " + file.getPath());
            System.out.println("Klasörün boyutu: " + file.length() / 1024);

            double bytes = file.length() / 1024;
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);
            System.out.println("Klasörün byte cinsinden boyutu: " + bytes);

            for (String dosyaIsimleri : file.list()) { //list metoduyla dosya isimlerini döneriz.
                System.out.println(dosyaIsimleri);

                if (dosyaIsimleri.equals("A")) {
                    File aFile = new File(ROOT + "\\" + dosyaIsimleri); //a klasörünü aç
                    if (aFile.isDirectory()) { //klasör diye mi kontrol et. klasör olmadan içinde arama yapamayız.
                        System.out.println("A klasörü içerisindeki dosyalar: ");
                        for (String a : aFile.list()) {
                            System.out.println(a);
                        }
                        break;
                    }
                }
            }

            File yeni=new File(ROOT,"yeni");
            yeni.mkdir();//klasör oluşturma
                //yeni.createNewFile(); //dosya oluştur
                //yeni.deleteOnExit(); //dosyayı siler


        } else {
            System.out.println("Dosya ya da klasör bulunamadı.");
        }


    }
}
