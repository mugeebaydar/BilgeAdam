package koleksiyonlar;

import java.util.Iterator;
import java.util.Vector;

public class VektorNesnesi {
    public static void main(String[] args) {
        Vector<String> renkler=new Vector<>();//kullanım olarak arraylistle aynıdır. tek farklı senkrondur. arrayliste göre yavaştır.
        renkler.add("Kırmızı");
        renkler.add("Mavi");
        renkler.add("Yeşil");
        renkler.add("Turuncu");

        for(String renk:renkler){
            System.out.println(renk);

        }

        System.out.println("İterator ile yazdırılması");
        Iterator iterator=renkler.iterator();

        String temp="";
        while (iterator.hasNext()){
            temp= (String) iterator.next();

            if(temp.equals("Turuncu")){
                iterator.remove();
                temp="";
            }
            System.out.println(temp);
        }
        System.out.println("İterator son durum: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }






    }
}
