package cokbicimlilik;

import java.util.ArrayList;

public class StartApp3 {
    public static void main(String[] args) {
        //genisletebilirlilik();
        //dinamikDizi();
        genisletebilirlilikWithArrayList();

    }

    public static void genisletebilirlilik(){

        Sekiller sekiller=new Sekiller();
        Sekiller sekiller2= new Sekiller();
        Dikdortgen dikdortgen=new Dikdortgen(3,5);
        Dikdortgen dikdortgen2=new Dikdortgen();
        dikdortgen2.setEn(2);
        dikdortgen2.setBoy(3);

        Kare kare=new Kare(9);
        Kare kare2=new Kare();
        kare2.setKenar(7);

        Sekiller [] sekillerDizisi=new Sekiller[6];
        sekillerDizisi[0]=sekiller;
        sekillerDizisi[1]=sekiller2;
        sekillerDizisi[2]=dikdortgen;
        sekillerDizisi[3]=dikdortgen2;
        sekillerDizisi[4]=kare;
        sekillerDizisi[5]=kare2;

        sekillerAlanlari(sekillerDizisi);

    }

    public static void genisletebilirlilikWithArrayList(){

        Sekiller sekiller=new Sekiller();
        Sekiller sekiller1=new Sekiller();
        Dikdortgen dikdortgen=new Dikdortgen(3,2);
        Dikdortgen dikdortgen1=new Dikdortgen(6,7);
        Kare kare=new Kare(90);
        Kare kare1=new Kare(50);

        ArrayList<Sekiller> sekillerList = new ArrayList<>();
        sekillerList.add(sekiller);
        sekillerList.add(sekiller1);
        sekillerList.add(dikdortgen);
        sekillerList.add(dikdortgen1);
        sekillerList.add(kare);
        sekillerList.add(kare1);

        //sekillerAlanlariWithArrayList(sekillerList);

        ArrayList<Sekiller> newSekillerList= new ArrayList<>();
        newSekillerList=getSifirdanBuyukOlanAlanlar(sekillerList);
        sekillerAlanlariWithArrayList(newSekillerList); //ekrana bastırmak için method

    }

    public static ArrayList<Sekiller> getSifirdanBuyukOlanAlanlar(ArrayList<Sekiller> sekillerArrayList){

        ArrayList<Sekiller> arrayList=new ArrayList<>(); //CONCURRENTMODİFİCATİON hatası almamak için başka bi threadle uğraş
        arrayList.addAll(sekillerArrayList);


        if(sekillerArrayList.size()>0){
            for(Sekiller sekil:arrayList){
                if(sekil.alanHesapla()==0){
                    arrayList.remove(sekil);  //alan sıfırsa listeden sil.
                }
            }
        }
        return arrayList;
    }

    public static void sekillerAlanlariWithArrayList(ArrayList <Sekiller> sekillerList){

        if(sekillerList.size()>0){
            for(Sekiller sekil:sekillerList){
                System.out.println("Şekil alani: "+sekil.alanHesapla());
            }
        }
    }



    public static void sekillerAlanlari(Sekiller[] sekillerDizi){

        if(sekillerDizi.length>0){
            for (Sekiller sekiller:sekillerDizi){
                System.out.println("Sekillerin alani: "+sekiller.alanHesapla());
            }
        }

    }

    public static void dinamikDizi(){

        ArrayList <Integer> subList=new ArrayList<>();
        ArrayList<Integer> arrayList=new ArrayList<>();
        //arrayList.add(1); //add listeye veri eklemek için kullanılır //0.indise 1 değeri atamak
        //arrayList.addAll(arrayList); //başka bir dizinin değerlerini başka diziye tamamen alabilmek için kullanılır
        //arrayList.get(0); //indis numarasını

        for(int i=1; i<10; i++){ //dizi içinde dön
            arrayList.add(i);
        }



        System.out.println("Temizlemeden önceki boyutu: "+arrayList.size());

        /*System.out.println(arrayList.get(0)); //ekrana 0.indisin değerini yani 1'i basar
        System.out.println(arrayList.get(1)); //1.indis değeri 2
        System.out.println(arrayList.get(2)); //2.indir değeri 3
        */

        arrayList.remove(3); //3.indisi sil. 4 değerini sil
        subList.add(10);
        subList.add(11);
        subList.add(12);
        arrayList.addAll(subList); //subList'i arraylist'e ekler.

        for(Integer eleman: arrayList){ //dizi elemanlarını yazdır
            System.out.println(eleman);
        }

        arrayList.clear();
        System.out.println("Temizlendikten sonraki boyutu: "+arrayList.size());

    }

}

