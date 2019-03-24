package tarihsaat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeSinifi {
    public static void main(String[] args) {
        LocalDateTime localdatetime=LocalDateTime.now();
        System.out.println("Şimdiki zaman ve tarih: "+localdatetime); // 2019-03-24T13:12:35.171

        LocalDateTime belirlirtarihZaman=LocalDateTime.of(2019,04,15,5,30,15);
        System.out.println("belirli tarih zaman: "+belirlirtarihZaman);

        LocalTime belirliSaniyeZaman=LocalTime.ofSecondOfDay(5000);

        LocalDateTime belirliTarih=LocalDateTime.of(LocalDate.now(), belirliSaniyeZaman);
        System.out.println("Belirir tarih ve date'e göre: "+belirliTarih);

    }
}
