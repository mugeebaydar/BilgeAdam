package presentation;

import entity.Personel;

import java.sql.Date;
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
                    flag=true;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.err.println("Yanlış seçenek.");
                    flag=true;
                    break;
            }


        } while (flag);

    }

    public void personelEkleMenu() {
        boolean flag = false;
        int secenek;
        Scanner scanner = new Scanner(System.in);
        do {
            Personel personel=new Personel();
            System.out.println("Personel ekleme menüsüne hoşgeldiniz.");
            System.out.println("1-)Ekle");
            System.out.println("0-)Bir üst menüye dön.");
            System.out.print("Seçiniz: ");
            secenek = scanner.nextInt();
            switch (secenek) {
                case 1:
                    flag=true;
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
                    flag=false;
                    break;
                default:
                    System.err.println("Yanlış seçenek");
                    flag=true;
            }


        } while (flag);
    }
}
