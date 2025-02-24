package ma.enset.Meties;

import ma.enset.DAO.DaoImpl;
import ma.enset.DAO.IDao;

public class MetierImpl implements IMetier{
    private IDao dao ;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double result = temp * 23;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
