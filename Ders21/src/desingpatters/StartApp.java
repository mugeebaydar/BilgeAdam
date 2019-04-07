package desingpatters;

import desingpatters.factory.Sekil;
import desingpatters.factory.SekilFactory;
import desingpatters.factory.SekilType;
import desingpatters.singleton.SingletonDesingPattern;

public class StartApp {
    public static void main(String[] args) {

       /* SingletonDesingPattern singletonDesingPattern=SingletonDesingPattern.getInstance();
        singletonDesingPattern.tanim();
        */
        Sekil sekilDikdortgen = SekilFactory.getSekil(SekilType.DIKDORTGEN);
        sekilDikdortgen.tanim();
        Sekil sekilKare = SekilFactory.getSekil(SekilType.KARE);
        sekilKare.tanim();
        Sekil sekilUcgen = SekilFactory.getSekil(SekilType.UCGEN);
        sekilUcgen.tanim();

    }
}
