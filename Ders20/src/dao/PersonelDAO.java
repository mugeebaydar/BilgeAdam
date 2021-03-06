package dao;

import entity.Personel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonelDAO extends BaseDAO<Personel> {


    @Override
    public boolean kaydet(Personel personel) {

        String sorgu = "insert into public.\"Personel\"(adi,soyadi,tc_no,tel,dogum_tarihi) values(?,?,?,?,?)";
        try {
            super.openConnection();
            PreparedStatement preparedStatement = getConnection().prepareStatement(sorgu);
            preparedStatement.setString(1, personel.getAdi());
            preparedStatement.setString(2, personel.getSoyadi());
            preparedStatement.setString(3, personel.getTcNo());
            preparedStatement.setString(4, personel.getTel());
            preparedStatement.setDate(5, personel.getDogumTarihi());

            if (executeUpdate(preparedStatement)) { //return executeUpdate(PreparedStatement)

                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }

        return false;
    }

    @Override
    public boolean guncelle(Personel personel) {

        String sorgu="update public.\"Personel\" set adi=?, soyadi=?, tc_no=?,tel=?,dogum_tarihi=? where id=? ";
        try {
            openConnection();
            PreparedStatement preparedStatement=getConnection().prepareStatement(sorgu);
            preparedStatement.setString(1,personel.getAdi());
            preparedStatement.setString(2,personel.getSoyadi());
            preparedStatement.setString(3,personel.getTcNo());
            preparedStatement.setString(4,personel.getTel());
            preparedStatement.setDate(5,personel.getDogumTarihi());
            preparedStatement.setLong(6,personel.getId());

            return executeUpdate(preparedStatement);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return false;
    }

    @Override
    public boolean sil(Personel personel) {

        openConnection();
        String sorgu="delete from public.\"Personel\" where id=?";
        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(sorgu);
            preparedStatement.setLong(1,personel.getId());
            return executeUpdate(preparedStatement);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return false;
    }

    @Override
    public List<Personel> listeGetir() {

        List<Personel> personelList = null;

        try {
            openConnection();
            String sorgu = "select * from public.\"Personel\"";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sorgu);
            ResultSet resultSet = super.execute(preparedStatement);

            if (resultSet != null) { //getRow tablo'daki kayıtlara göre kayıt getirir

                personelList=new ArrayList<>();

                while (resultSet.next()) {
                    Personel personel = new Personel();
                    personel.setId(resultSet.getLong("id"));
                    personel.setAdi(resultSet.getString("adi"));
                    personel.setSoyadi(resultSet.getString("soyadi"));
                    personel.setTcNo(resultSet.getString("tc_no"));
                    personel.setTel(resultSet.getString("tel"));
                    personel.setDogumTarihi(resultSet.getDate("dogum_tarihi"));
                    personelList.add(personel);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return personelList;
    }

    @Override
    public Personel findById(Long id) {
        Personel personel=null;
        openConnection();
        String sorgu="select* from public.\"Personel\" where id=?";
        try {
            PreparedStatement preparedStatement=getConnection().prepareStatement(sorgu);
           // preparedStatement.setLong(1,id);
            preparedStatement.setLong(1,id);

            ResultSet resultSet=execute(preparedStatement);
            if(resultSet!=null){
                personel=new Personel();
                while (resultSet.next()){
                    personel.setId(resultSet.getLong("id"));
                    personel.setAdi(resultSet.getString("adi"));
                    personel.setSoyadi(resultSet.getString("soyadi"));
                    personel.setTcNo(resultSet.getString("tc_no"));
                    personel.setTel(resultSet.getString("tel"));
                    personel.setDogumTarihi(resultSet.getDate("dogum_tarihi"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            closeConnection();
        }
        return personel;
    }
}
