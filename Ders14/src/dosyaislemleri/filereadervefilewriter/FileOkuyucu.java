package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class FileOkuyucu {

    private static final String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {

        try(BufferedReader reader=new BufferedReader(new FileReader(new File(ROOT,"Java.txt")))){

            String data="";
            while ((data=reader.readLine())!=null){ //nulla eşit değilse okuma,eşitse oku
                System.out.println(data);
            }

        } catch (IllegalStateException  | IOException  | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
