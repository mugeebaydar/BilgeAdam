package tarihsaat;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeSinifi {
    public static void main(String[] args) {

        LocalTime suanKiSaat= LocalTime.now();
        System.out.println("Şuan Ki Saat: "+suanKiSaat);

        LocalTime saniyeSonrasi=LocalTime.now().plusSeconds(5000);
        System.out.println("Şaunki saatin belirli saniye sonrası: "+saniyeSonrasi);

        LocalTime belirliSaat=LocalTime.of(5,45,20);
        System.out.println("Belirli saat: "+belirliSaat);

        LocalTime bolgeselSaat=LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println("Bolgesel saat: "+bolgeselSaat);

        LocalTime belirliSaniyeZaman= LocalTime.ofSecondOfDay(9565); //günü hangi saatine denk geliyor. saniye cinsinden
        System.out.println("belirli saniye zaman "+belirliSaniyeZaman);

    }
}
