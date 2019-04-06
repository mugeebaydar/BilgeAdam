package kodbloklari;

public class KodBloklariApp {
    public static void main(String[] args) {

        int a=5;
        System.out.println("Kademe1 a degeri: "+a);
        {
            //b=6; b'ye erişemeyiz. her zaman üst kademeden değişkenlere erişim olur.
            a=3;
            System.out.println("Kademe2 a degeri: "+a);
            {
                int b=10;
                a=2;
                System.out.println("Kademe3: "+"a degeri: "+a+" b degeri: "+b);
                {
                    b=7;
                    System.out.println("kademe4 "+"a degeri "+a+" b degeri: "+b);
                }
            }
        }

    }
}
