package presentation;

import entity.Personel;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class PersonelView {

    private PersonelController personelController;

    public PersonelView() {
        this.personelController = new PersonelController();
    }

    public void menu() {

        boolean flag = false;
        int secenek;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Personel İşlemlerine Hoşgeldiniz.");
            System.out.println("1-)Personel Ekle");
            System.out.println("2-)Personel Getir");
            System.out.println("3-)Personel Listele");
            System.out.println("4-)Personel Güncelle");
            System.out.println("5-)Personel Sil");
            System.out.println("0-)Çıkış");
            System.out.print("Seçiniz: ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    personelEkleMenu();
                    flag = true;
                    break;
                case 2:
                    personelYaz();
                    flag = true;
                    break;
                case 3:
                    personelListesiYaz();
                    flag = true;
                    break;
                case 4:
                    personelGuncelleMenu();
                    flag = true;
                    break;
                case 5:
                    personelSil();
                    flag=true;
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.err.println("Yanlış seçenek.");
                    flag = true;
                    break;
            }


        } while (flag);

    }

    public void personelYaz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Personelin ID değerini giriniz: ");
        Long deger = scanner.nextLong();
        Personel personel = personelController.onPersonelById(deger);
        if (personel != null) {
            System.out.println(personel);
        }
    }

    public void personelListesiYaz() {

        List<Personel> personelList = personelController.onPersonelList();

        if (personelList != null && personelList.size() > 0) {
            personelList.stream().forEach(System.out::println);
        }
    }

    public void personelEkleMenu() {
        boolean flag = false;
        int secenek;
        Scanner scanner = new Scanner(System.in);
        do {
            Personel personel = new Personel();
            System.out.println("Personel ekleme menüsüne hoşgeldiniz.");
            System.out.println("1-)Ekle");
            System.out.println("0-)Bir üst menüye dön.");
            System.out.print("Seçiniz: ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    flag = true;
                    System.out.println("Adı: ");
                    personel.setAdi(scanner.next());
                    System.out.println("Soyadi: ");
                    personel.setSoyadi(scanner.next());
                    System.out.println("Tc NO: ");
                    personel.setTcNo(scanner.next());
                    System.out.println("Tel: ");
                    personel.setTel(scanner.next());
                    System.out.println("Doğum tarihi: ");
                    personel.setDogumTarihi(Date.valueOf(scanner.next()));
                    personelController.onPersonelKaydet(personel);
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.err.println("Yanlış seçenek");
                    flag = true;
            }
        } while (flag);
    }

    public void personelGuncelleMenu() {
        boolean flag = false;
        int secenek;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Personel güncelleme menüsüne hoşgeldiniz: ");
            System.out.println("1-)Güncelle");
            System.out.println("0-)Üst menüye dön");
            System.out.print("Seçiniz: ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    flag = true;
                    Personel personel = new Personel();
                    System.out.print("Id: ");
                    personel.setId(scanner.nextLong());
                    System.out.print("Adı: ");
                    personel.setAdi(scanner.next());
                    System.out.print("Soyadı: ");
                    personel.setSoyadi(scanner.next());
                    System.out.print("Tc: ");
                    personel.setTcNo(scanner.next());
                    System.out.print("Tel: ");
                    personel.setTel(scanner.next());
                    System.out.print("Doğum Tarihi: ");
                    personel.setDogumTarihi(Date.valueOf(scanner.next()));
                    personelController.onUpdate(personel);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("yanlış seçenek");
                    flag = true;
                    break;
            }
        } while (flag);
    }

    public void personelSil() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silmek istediğiniz personelin ID'sini giriniz: ");
        Personel personel = new Personel();
        personel.setId(scanner.nextLong());
        personelController.onDelete(personel);

    }
}
