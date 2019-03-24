package tarihsaat;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Set;

public class LocalDateSinif {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        System.out.println("Bugünün tarihi: "+bugun);

        LocalDate yarin=LocalDate.now().plusDays(1);
        System.out.println("Yarinin tarihi: "+yarin);

        LocalDate birSonrakiAy=LocalDate.now().plusMonths(1);
        System.out.println("Bir sonraki ay: "+birSonrakiAy);

        LocalDate belirliTarih=LocalDate.of(2020,1,15);
        System.out.println("Belirli tarih: "+belirliTarih);

        LocalDate belirliBolgeZaman=LocalDate.now(ZoneId.of("Etc/GMT+9"));
        System.out.println("Belirli bolge zaman: "+belirliBolgeZaman);

        Set<String> bolgeler=ZoneId.getAvailableZoneIds();
        System.out.println(bolgeler);

        LocalDate gunHangiTarih=LocalDate.ofYearDay(2019,150);
        System.out.println("2019'un 150.günü hangi güne denk geliyor? "+gunHangiTarih);


    }
}
