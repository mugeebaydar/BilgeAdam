package koleksiyonlar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetArabirimi {
    public static void main(String[] args) {

        HashSet<String> renkler= new HashSet<>();
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");
        renkler.add("Sarı");
        renkler.add("Sarı");
        //sette treadlar a senkrondur. iki tane aynı nesneden yazılırsa bir tane yazdırır.

        for(String renk:renkler){
            System.out.println(renk);
        }

        System.out.println("Set arabirimi ile hashset kullanımı: ");
        Set<String>  sayilar=new HashSet<>();
        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        sayilar.add("4");
        sayilar.add("4");
        System.out.println("sayilar set arabiriminin boyutu: "+sayilar.size()); //iki kez girilen 4'ü bir kere aldı

        Iterator iterator=sayilar.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("sayıların foreach ile yazdırılması:");
        for(String sayi:sayilar){
            System.out.println(sayi); //farklı sıralamayla yazdırabilir bazen
        }



    }
}
