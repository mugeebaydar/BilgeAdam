package jeneriksiniflar;

public class DiziIslemleriJenerik2<T> implements DiziIslemleriArayuz<T> {
/*
generic veri tipim T. arayuzde g idi burada T yaptık bu yüzden belirtiyoruz.
 */

    @Override
    public void diziYaz(T[] g) {
        for(T t:g){
            System.out.println(t);
        }
    }
}
