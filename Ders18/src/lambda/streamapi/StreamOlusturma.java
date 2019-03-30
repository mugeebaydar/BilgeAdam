package lambda.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOlusturma {
    public static void main(String[] args) {

        Stream.of("1","2","3","Ali","Kırmızı").forEach(System.out::println);

        String [] renkler={"Kırmızı","Mavi","Beyaz","Yeşil"};
        System.out.println("Dizi ile kullanımı: ");
        Arrays.stream(renkler).forEach(System.out::println);

        int [] sayilar={1,2,3,4,5};
        System.out.println("Sayılar dizisi: ");
        Arrays.stream(sayilar).forEach(System.out::println);

    }
}
