package mantiksalOperatorler;

public class MantiksalOperatorApp {
    public static void main(String[] args) {

      /** 1) <var1> && <var2> ve operatörü, sağındaki ve solundaki değişken değeri
         true ise true değerini verir
       */

        /**
         * <var1> || <var2> yada operatörü
         * sağındaki ve solundaki değerler false ise false değerini verir
         * sağındaki ve solundaki değerlerden birisi true diğeri false ise true değerini verir.
         */

        /**
         * 1<var1> değil mi operatörü
         * verilen değişkenin tersini bize verir
         * verilen değişken true ise false değerinin verir.
         * verilen değişken false ise true değerini verir.
         */

        /**
         * XOR OR &&'nın tersidir.
         * <var1> ^ <var2> xor oparatörü yada işleminin tersi
         * True True olma durumunda False değeri döner
         * False False olma durumunda True değeri döner
         */

        boolean x=true, y=false,z=true, t=false,sonuc;
        sonuc= x&&z;
        System.out.println("X ve Z and (&&) ile karşılastırılması: "+sonuc);
        sonuc= x&&y;
        System.out.println("X ve Y and (&&) ile karşılaştırılması: "+sonuc);

        sonuc= y||t;
        System.out.println("Y ve T veya (||) ile karşılaştırılması: "+sonuc);
        sonuc = x||y;
        System.out.println("X ve Y veya (||) ile karşılaştırılması: "+sonuc);

        sonuc= !x;
        System.out.println("X değişkeninin tersini al: "+sonuc);
        sonuc= !y;
        System.out.println("Y değişkeninin tersini al: "+sonuc);
        sonuc= !z;
        System.out.println("Z değişkeninin tersini al: "+sonuc);

        sonuc=x^z;
        System.out.println("X ve Z yada oparatörünün tersi (^) ile karşılaştırılması: "+sonuc);

        sonuc=x^y;
        System.out.println("x ve y yada oparatörünün tersi (^) ile karşılaşıtırılması: "+sonuc);

    }
}
