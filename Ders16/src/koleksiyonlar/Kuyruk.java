package koleksiyonlar;

import java.util.LinkedList;
import java.util.Queue;

public class Kuyruk {
    public static void main(String[] args) {
        //ilk giren ilk çıkar

        Queue<String> kuyruk=new LinkedList<>(); //sıralı old. içni linked dedik
        kuyruk.offer("a");
        kuyruk.offer("1");
        kuyruk.offer("b");
        kuyruk.offer("c");

        ((LinkedList<String>) kuyruk).addFirst("x");
        ((LinkedList<String>) kuyruk).addLast("y");

        System.out.println("Çıkarılan Eleman: "+kuyruk.poll()); //ilk giren ilk çıkar

        kuyruk.poll();
        for(String k:kuyruk){
            System.out.println(k);
        }
        System.out.println();
        System.out.println("Kuyruktaki ilk eleman: "+kuyruk.peek()); //ilk elemanı getirir.
        System.out.println("peekFirstle ilk eleman: "+((LinkedList<String>) kuyruk).peekFirst());
        System.out.println("peekLast ile son eleman: "+((LinkedList<String>) kuyruk).peekLast());

    }
}
