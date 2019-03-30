package lambda.streamapi;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Integer> sayilar= Arrays.asList(7,23,5,87,3,9,99);
        IntSummaryStatistics istatistik=sayilar.stream().filter(x->x>0).collect(Collectors.summarizingInt(Integer::intValue)); //sayılarda işlem yaptımız sınıf. istatisliğini verir
        System.out.println("En küçük sayi"+istatistik.getMin());
        System.out.println("En büyük sayı: "+istatistik.getMax());
        System.out.println("Toplamları: "+istatistik.getSum());
        System.out.println("sayıların boyutu: "+istatistik.getCount());
        System.out.println("Ortalama: "+istatistik.getAverage());

    }
}
