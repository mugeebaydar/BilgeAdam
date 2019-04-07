package desingpatters.factory;

public class SekilFactory {

    private SekilFactory() {

    }

    public static Sekil getSekil(SekilType sekilType) {
        Sekil sekil = null;
        switch (sekilType) {
            case DIKDORTGEN:
                sekil = new Dikdortgen();
                break;
            case KARE:
                sekil = new Kare();
                break;
            case UCGEN:
                sekil = new Ucgen();
                break;
            default:
                System.err.println("Belirtilen şekil bulunamadı.");
                break;
        }


        return sekil;
    }
}
