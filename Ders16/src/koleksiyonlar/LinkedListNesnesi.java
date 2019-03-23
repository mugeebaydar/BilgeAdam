package koleksiyonlar;

import java.util.*;

public class LinkedListNesnesi {

    public static void main(String[] args) {

        List<String> sayilar= new LinkedList<>(); //linkedlist bir önceki ve sonraki elemanları pointeri alır
        sayilar.add("1");
        sayilar.add("2");
        sayilar.add("3");
        sayilar.add("4");

        ((LinkedList<String>) sayilar).addFirst("0"); //cast sebebi interface olması
        ((LinkedList<String>) sayilar).addLast("5");

        for(String sayi:sayilar){
            System.out.println(sayi);
        }


        System.out.println("Sondaki eleman siliniyor.."+((LinkedList<String>) sayilar).removeLast());

        Iterator iterator1=sayilar.iterator();
        Iterator iterator2=((LinkedList<String>) sayilar).descendingIterator(); //sondaki elemandan başlayarak yazdırma
        System.out.println("Linkedlist tersten yazdıralım..");
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("Previous kullanarak tersten yazdırılması");
        Iterator iterator3=sayilar.listIterator(sayilar.size()); //tersten döndürebiliriz size alarak bir önceki elemana doğru döndürür

        while (((ListIterator) iterator3).hasPrevious()){ //sondan bir önceki elemandan ilerler (hasnext)
            System.out.println(((ListIterator) iterator3).previous());
        }
    }

}
