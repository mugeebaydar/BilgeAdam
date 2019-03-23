package koleksiyonlar;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetNesnesi {
    public static void main(String[] args) {

        Set<String> sayilar=new LinkedHashSet<>();
        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        sayilar.add("4");
        sayilar.add("4");
        System.out.println("Sayiların boyutu: "+sayilar.size());

        //tek amacı sıralı bir şekilde tutuyor olması.

        for(String sayi:sayilar){
            System.out.println(sayi);
        }
        System.out.println("İterator ile yazdırılması: ");
        Iterator iterator=sayilar.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
