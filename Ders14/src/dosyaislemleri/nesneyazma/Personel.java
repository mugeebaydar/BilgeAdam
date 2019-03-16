package dosyaislemleri.nesneyazma;

import java.io.Serializable;

public class Personel implements Serializable {

    //ide kendisi generate etmiş oluyor. belirli sıraya göre ilerlemek gerektiği için bu yöntem kullanılır.
    private static final long serialVersionUID = 5817309516155611791L;

    private String ad;
    private String soyad;

    public Personel() {

    }

    public Personel(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return this.ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getSoyad() {
        return this.soyad;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }
}
