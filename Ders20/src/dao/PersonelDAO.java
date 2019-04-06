package dao;

import entity.Personel;

import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            closeConneciton();
        }

        return false;
    }

    @Override
    public boolean guncelle(Personel personel) {
        return false;
    }

    @Override
    public boolean sil(Personel personel) {
        return false;
    }

    @Override
    public List<Personel> listeGetir() {
        return null;
    }

    @Override
    public Personel findById() {
        return null;
    }
}
