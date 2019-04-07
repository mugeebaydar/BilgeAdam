package veritabani;

import java.sql.*;

public class SorguResultSet {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(VeritabaniBilgileriEnum.DATABASE_URL.getValue(),
                    VeritabaniBilgileriEnum.KULLANICI_ADI.getValue(),
                    VeritabaniBilgileriEnum.SIFRE.getValue());
            System.out.println("Veritabanı bağlantısı gerçekleştirildi.");

            String sorgu = "SELECT * FROM public.\"Personel\"";

            Statement statement = conn.createStatement();
            //fetchsize set edildiği zaman dataları verilen değer kadar getiriyor. 4 kayıt var ise kayıtları
            //ikişer ikişer selecek çekerek getiriyor.
            statement.setFetchSize(2);

            ResultSet resultSet = statement.executeQuery(sorgu); //resultset iterator gibi veri içinde gezer
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " "
                        + resultSet.getString("ad") + " "
                        + resultSet.getString("soyad") + " "
                        + resultSet.getString("tc_no") + " "
                        + resultSet.getString("tel")+ " "
                        + resultSet.getDate("dogum_tarihi"));
            }

        } catch (SQLException e) {
            System.err.println("Bağlantı gerçekleştirilemedi.");
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Bağlantı kapatıldı.");
                } catch (SQLException e) {
                    System.err.println("Bağlantı kapatılırken sorun meydana geldi.");
                    e.printStackTrace();
                }
            }
        }
    }
}
