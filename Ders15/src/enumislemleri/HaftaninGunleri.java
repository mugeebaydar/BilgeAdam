package enumislemleri;

/*
Enumların gelme sebebi okunabilir kod yazılır.
genellikle cast değişkenler kullanmak için kullanılır.
tüm castları bi classa yazayım ve erişeyim
static olarak erişilir
yapıcı methodları privatedır zorunludur
enumları oluşturamayız static olarak erişiriz.

programda hiçbir zaman değeri değiştirilemeyecek değişkenler için enum kullanılır.
 */
public enum HaftaninGunleri {

    PAZARTESI(1, "Pazartesi","Haftaiçi"),
    SALI(2, "Salı","Haftaiçi"),
    CARSAMBA(3, "Çarşamba","Haftaiçi"),
    PERSEMBE(4, "Perşembe","Haftaiçi"),
    CUMA(5, "Cuma","Haftaiçi"),
    CUMARTESI(6, "Cumartesi","Haftasonu"),
    PAZAR(7, "Pazar","Haftasonu");

    private Integer key;
    private String value;
    private String ozet;

    private HaftaninGunleri(Integer key, String value, String ozet ) {
        this.key = key;
        this.value = value;
        this.ozet=ozet;
    }
    public Integer getKey(){
        return this.key;
    }
    public void setKey(Integer key){
        this.key=key;
    }
    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value=value;
    }
    public String getOzet(){
        return this.ozet;
    }
    public void setOzet(String ozet){
        this.ozet=ozet;
    }
}
