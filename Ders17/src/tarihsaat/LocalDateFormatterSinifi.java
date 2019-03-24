package tarihsaat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateFormatterSinifi {
    public static void main(String[] args) {

        LocalDate localDate=LocalDate.now();
        String bugununTarihi;
        bugununTarihi=localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Bugünün tarihi: "+bugununTarihi);

        LocalDateTime localDateTime=LocalDateTime.now();
        String bugununTarihiSaati;
        bugununTarihiSaati=localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Bugunun tarihi ve saati: "+bugununTarihiSaati);


        Date date=Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant()); //convert etme
        System.out.println("Java util date cevrilmesi: "+date);

    }
}
