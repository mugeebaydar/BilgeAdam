package koleksiyonlar;

import java.util.*;

public class MapArabirimi {
    public static void main(String[] args) {

        HashMap<Integer, String> haftaninGunleri = new HashMap<>();
        haftaninGunleri.put(1, "Pazartesi");
        haftaninGunleri.put(2, "Salı");
        haftaninGunleri.put(3, "Çarşamba");
        haftaninGunleri.put(4, "Perşembe");
        haftaninGunleri.put(5, "Cuma");
        haftaninGunleri.put(6, "Cumartesi");
        haftaninGunleri.put(7, "Pazar");
        haftaninGunleri.put(1, "Pazar");

        System.out.println("Haftanin 5.günü: " + haftaninGunleri.get(5));

        System.out.println("Haftanın 1.günü: " + haftaninGunleri.get(1)); //son eklenen değeri alır(iki tane 1 değeri)

        Map<String, String> gunAciklama = new HashMap<>();
        gunAciklama.put("Pazar", "Bugün tatil.");
        gunAciklama.put("Pazartesi", "Bugün iş günü.");
        System.out.println("Pazar günü açıklaması: " + gunAciklama.get("Pazar"));


        List<String> birinciSinifListesi = new ArrayList<>();
        birinciSinifListesi.add("Ali");
        birinciSinifListesi.add("Ahmet");
        List<String> ikinciSinifListesi = new ArrayList<>();
        ikinciSinifListesi.add("Veli");
        ikinciSinifListesi.add("Can");

        Map<String, List<String>> sinifDuzeyleri = new HashMap<>();
        sinifDuzeyleri.put("1", birinciSinifListesi);
        sinifDuzeyleri.put("2", ikinciSinifListesi);

        System.out.println("1.sınıf listesi");
        for (String ogrenci : sinifDuzeyleri.get("1.sınıf")) {//!!!
            System.out.println(ogrenci);
        }

        Set<String> keyDegerleri = sinifDuzeyleri.keySet();
        System.out.println(keyDegerleri);

        for (String key : keyDegerleri) {
            if (key.equals("1.sınıf")) {
                System.out.println("Sınıf duzeyleri boyutu: " + sinifDuzeyleri.size());
                System.out.println("1.sınıflar mevcut");
                System.out.println("1.sınıflar siliniyor.");
                sinifDuzeyleri.remove(key);

                System.out.println("son boyutu: " + sinifDuzeyleri.size());


            }
        }


    }
}
