package ma.enset.ext;

import ma.enset.DAO.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public Double getData() {
        System.out.println("Vesion web service");
        double temp = 11;
        return temp;
    }
}
