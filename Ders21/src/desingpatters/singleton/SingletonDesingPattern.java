package desingpatters.singleton;

public class SingletonDesingPattern {

    private static SingletonDesingPattern instance;

    private SingletonDesingPattern(){

    }

    public void tanim(){
        System.out.println("Ben bir kere üretilen bir nesneyim.");
    }

    public static SingletonDesingPattern getInstance(){
        if(instance==null){
            instance=new SingletonDesingPattern();
        }
        return instance;
    }

}
