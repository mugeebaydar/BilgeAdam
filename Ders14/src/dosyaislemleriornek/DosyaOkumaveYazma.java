package dosyaislemleriornek;

import java.io.*;

public class DosyaOkumaveYazma {
    private final static String ROOT="C:\\DosyaIslemleri\\";
    public static void main(String[] args) {
        File file=new File(ROOT,"dosyaOkumaYazma.txt");

        String data="";
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;

        try {
            file.createNewFile();
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Java dersi ");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılamadı.");
            }
        }
        try(BufferedReader reader=new BufferedReader(new FileReader(new File(ROOT,"dosyaOkumaYazma.txt")))){

            while ((data=reader.readLine())!=null){ //nulla eşit değilse okuma,eşitse oku
                System.out.println(data);
            }

            char [] dizi= data.toCharArray();

            for(int i=dizi.length-1; i>=0; i--){
                System.out.println(dizi[i]);
            }



        } catch ( IOException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
}
