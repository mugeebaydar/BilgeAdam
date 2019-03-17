package dosyaislemleriornek;

import java.io.*;

public class DosyaIslemleri {
    private final static String ROOT = "C:\\DosyaIslemleri\\";
    private String dosyaIsmi;

    public void dosyaYazma(String data) throws IOException {

        if (dosyaIsmi != null && data != null && dosyaIsmi.length()>1) { //data ve dosyaismi yoksa hiçbir işlem yapma
            File file = new File(ROOT, dosyaIsmi);

            if (!file.exists()) {
                file.createNewFile();
            }
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(data);
                bufferedWriter.close();
            }
         else {
            System.out.println("Gelen veri ve dosya ismi boş olduğu için yazma işlemi başlatılamadı.");
        }

    }

    public String dosyaOkuma() throws IOException {

        String donenData="";

        if(dosyaIsmi!=null){
            File file=new File(ROOT,dosyaIsmi);

            if(file.exists()){
                FileReader fileReader=new FileReader(file);
                BufferedReader reader=new BufferedReader(fileReader);

                String line="";

                while ((line=reader.readLine())!=null){
                    donenData=line;
                }
                reader.close();
            }
        }
        else{
            System.out.println("Okunacak dosya bulunamadı.");
        }
        return donenData;
    }

    public void terstenYazdirma(String data){
        char [] karakterDizi=null;
        if(data!=null){
            karakterDizi=data.toCharArray();

            for(int i=karakterDizi.length-1; i>=0; i--){
                System.out.print(karakterDizi[i]);
            }
        }
    }


    public String getDosyaIsmi() {
        return this.dosyaIsmi;
    }

    public void setDosyaIsmi(String dosyaIsmi) {
        this.dosyaIsmi = dosyaIsmi;
    }
}
