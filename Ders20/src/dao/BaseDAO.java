package dao;

import java.sql.*;
import java.util.List;

public abstract class BaseDAO<T> {

    private Connection connection;

    public void openConnection(){
        try {
            connection= DriverManager.getConnection(VeritabaniBilgileri.CONNECTION_URL.getValue(),
                    VeritabaniBilgileri.USERNAME.getValue(),
                    VeritabaniBilgileri.PASSWORD.getValue());
            System.out.println("Veritabanı bağlantısı sağlandı.");


        } catch (SQLException e) {
            System.err.println("Veritabanına bağlanılamadı!!!");
            e.printStackTrace();
        }
    }

    public boolean executeUpdate(PreparedStatement preparedStatement){
        int status=0; //return tipim int ise int'e eşitlemek için oluşturuldu

        try {
            status=preparedStatement.executeUpdate();
            if(status==1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return false;
    }
    public ResultSet execute(PreparedStatement preparedStatement){
        ResultSet resultSet=null;

        try {
            resultSet=preparedStatement.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public void closeConneciton(){
        if(connection!=null){
            try {
                connection.close();
                System.out.println("Veritabanı bağlantısı kapatıldı.");
            } catch (SQLException e) {
                System.err.println("Veritabanı bağlantısı kapatılamadı!!!");
                e.printStackTrace();
            }
        }
    }

    public abstract boolean kaydet(T t); //generic sınıflar kullanıldı save()
    public abstract boolean guncelle(T t); //update()
    public abstract boolean sil(T t); //delete()
    public abstract List<T> listeGetir(); //findAll()
    public abstract T findById(); //findById ID tarafından bul demek.id ile bul. Belirlir bir id'ye göre obje getiren method



    public Connection getConnection(){
        return this.connection;
    }

}
