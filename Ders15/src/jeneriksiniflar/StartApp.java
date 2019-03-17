package jeneriksiniflar;

public class StartApp {

    public static void main(String[] args) {

        String [] strDizi={"selam","naber"};
        Integer [] intDizi={1,2,3,};
        Character[] charDizi={'a','b','c'};

        DiziIslemleri diziIslemleri=new DiziIslemleri();
        diziIslemleri.diziYaz(strDizi);
        diziIslemleri.diziYaz(intDizi);
        diziIslemleri.diziYaz(charDizi);

        System.out.println();

        System.out.println("Jenerik sınıf ile yazılması: ");
        DiziIslemleriJenerik diziIslemleriJenerik=new DiziIslemleriJenerik();
        diziIslemleriJenerik.diziYaz(strDizi);
        diziIslemleriJenerik.diziYaz(intDizi);
        diziIslemleriJenerik.diziYaz(charDizi);

    }
}
