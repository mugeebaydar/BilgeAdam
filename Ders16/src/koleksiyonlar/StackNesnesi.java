package koleksiyonlar;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackNesnesi {
    public static void main(String[] args) {

        //İlk giren son çıkar

        Stack<String> sayi=new Stack<>();
        sayi.push("1");
        sayi.push("2");
        sayi.push("3");
        sayi.push("4");

        System.out.println("Elemanım nerede: "+sayi.search("3"));

        for(String s:sayi){
            System.out.println(s);
        }

        System.out.println("Çıkarılan eleman: "+sayi.pop()); //pop elman çıkarmak
        sayi.pop();

        for(String s:sayi){
            System.out.println(s);
        }

        System.out.println("Iterator ile yazdırma: ");
        Iterator iterator=sayi.listIterator();
        while(iterator.hasNext()){
            System.out.println(((ListIterator) iterator).previous());
            System.out.println(iterator.next());
        }
        //bir sonrakini bulabilmek için tersten yazdırılabilir previos
/*
Iterator iterator=sayi.listIterator();
        while(iterator.hasNext()){
            System.out.println(((ListIterator) iterator).previous());
            System.out.println(iterator.next());
        }
 */




    }
}
