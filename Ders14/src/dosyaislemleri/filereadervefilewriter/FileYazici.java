package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class FileYazici {
    private static final String ROOT="C:\\DosyaIslemleri\\";

    public static void main(String[] args) {

        File file=new File(ROOT,"Java.txt");
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null; //senkron şekilde veri okumak için kullanılır

        try {
            file.createNewFile();
            fileWriter=new FileWriter(file);

            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Java 1995 yılında Jasmes Gosling tarafından yazılmıştır.");
            bufferedWriter.newLine(); //bir satır atla
            bufferedWriter.write("End");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılamadı.");
            }
        }
    }
}
