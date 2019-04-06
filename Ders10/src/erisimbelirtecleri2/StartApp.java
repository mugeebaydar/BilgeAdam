package erisimbelirtecleri2;

import erisimbelirtecleri.Dikdortgen;

/*1-private ile sadece sınıf üzeriden erişme olur.
2-public ile tüm paketlerden erişim sağlayabilirim.
3-protected ile sadece aynı paketten ve protected tanımlı methodu olan sınıfın alt sınıflarından
erişebilirim.
4-default erişim beliteci ile sadece o paket içerisinden erişebilirim.
*/
public class StartApp {
    public static void main(String[] args) {
        Dikdortgen dikdortgen=new Dikdortgen();
       dikdortgen.setEn(10);
    }

}
