package odev;

public class DiziSiralaApp {
    public static void main(String[] args) {

        //Dizideki elemanları küçükten büyüğe doğru sıralayan ve ekrana yazdıran program
        //Cevap: 0,1,3,4,7,9,17,22,88,125 for ve if döngüsü kullanarak
        int[] dizi = {7, 3, 125, 9, 1, 0, 17, 88, 22, 4};
        System.out.println("Dizimizin boyutu: " + dizi.length);

        int temp=0;

        for (int i = 0; i <= dizi.length; i++) { //dizinin elemanı kadar for döngüsü

            //dizinin boyutunu aşmaması için length -1 dedik. İlk 0.indisle karşılaştırılmas yapıldığı için -1 düşülür.
            for (int k = i + 1; k <=dizi.length-1; k++) { //diğer elemanlarla karşılaştırma yapılması için bir fon döngüsü daha

                if(dizi[i] > dizi [k]){
                    temp=dizi[k]; // k değeri büyükse temp'te tut
                    dizi[k]=dizi[i]; //büyükse k değerini bir sonraki yere ata
                    dizi[i]=temp;
                }

            }

        }
        String sonuc="";
        for(int diziElemani:dizi){
            sonuc+=diziElemani+" "; //sonuc=sonuc+diziElemani

        }
        System.out.print("Dizinin sıralı hali: "+sonuc);

    }
}
