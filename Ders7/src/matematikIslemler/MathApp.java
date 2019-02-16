package matematikIslemler;

import java.sql.SQLOutput;
import java.util.Random;

public class MathApp {
    public static void main(String[] args) {

        //Math sınıfı Java.lang paketim ile otomatik olarak gelir.

        System.out.println("Sayının kökünü alma: " + Math.sqrt(16));
        System.out.println("Sayının mutlak değeri: " + Math.abs(-2 + 1));
        System.out.println("Ondalıklı sayının bir üst tam sayı değerini alma: " + Math.ceil(2.17));
        System.out.println("Ondalıklı sayının bir alt tam sayı değerini alma: " + Math.floor(5.63));
        System.out.println("Ondalıklı sayıda en yakın tam sayı değerini alma (0.50 yukarı): " + Math.round(5.85));
        System.out.println("Bir sayının üssünü alma: " + Math.pow(5, 2));
        System.out.println("Sayılar arasında büyük olanı bulma: " + Math.max(1, 6));
        System.out.println("Sayılar arasında küçük olanı bulma: " + Math.min(1, 6));
        System.out.println("Pi sayısının değeri: " + Math.PI);
        System.out.println("Log da kullanılan lne değeri(Euler değer): " + Math.E);
        System.out.println("Sıfır ile 1 arasında ondalıklı random sayı üretme:  " + Math.random());
        System.out.println("0 ile 20 arasında random sayı üretme (tam sayı değer için int'e casting): " + (int) (Math.random() * 20));

        Random random=new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(5)); //0'la 5 arasında random sayı üretme
        System.out.println(random.longs(8,100));
    }
}
