package stringler;

public class StringIfadeler {
    public static void main(String[] args) {

        String jv="Merhaba Java";
        String a= new String("Merhaba Java");
        //String a="Merhaba Java";
        System.out.println(jv);
        System.out.println(a);

        System.out.println("java değişkeninin boyutu: "+jv.length());
        System.out.println("a değişkeninin boyutu: "+a.length()); //boşlukları da boyuta ekler

        if(jv ==a){ //stack ve heap kavramlarıyla karşılaştırma
            System.out.println("eşit");
        }
        //String kullanırken equals kullanmak önemli!!
        if(jv.equals(a)){ //equals new ile tanımlandığı zamanki karşılaştırma için kullanılır.
            System.out.println("Equals ile eşittir.");
        }


    }
}
