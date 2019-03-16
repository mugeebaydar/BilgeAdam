package dosyaislemleri.filereadervefilewriter;

import java.io.*;

public class DosyaKaldigiYerdenYazdirma {
    private final static String ROOT_FILE="C:\\DosyaIslemleri\\Java.txt";

    public static void main(String[] args) {


        BufferedWriter bufferedWriter=null;


        try {
            FileWriter fileWriter=new FileWriter(ROOT_FILE,true); //dosyanın kaldğı yerden yazma yapabilmesi için true yapılmali


            bufferedWriter=new BufferedWriter(fileWriter);


            bufferedWriter.write("xccz");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
