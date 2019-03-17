package stringislemleri;

public class StartApp {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(" Bir Teknolojidir.").append(" 1995 yılında").append(" yazılmışır."); //append ekleme methodu. //reverse tersten yazdırma

        String ifade = "James Gosling Tarafından ";

        System.out.println("İnsert edilmiş hali: ");
        stringBuilder.insert(22, "James Gosling Tarafından "); //insert indeks sayılarının arasına ne yazılacaksa oraya yazmayı sağlar
        System.out.println(stringBuilder);

        stringBuilder.delete(22, 22 + ifade.length());
        System.out.println("Delete edilmiş hali: ");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println("Tersten yazdırılmış hali" + stringBuilder);

        StringBuffer stringBuffer=new StringBuffer("Merhaba Java"); //stringbuilderle aynı çalışır. senkron çalışır
        System.out.println(stringBuffer);

    }
}
