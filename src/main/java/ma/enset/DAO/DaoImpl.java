package ma.enset.DAO;

public class DaoImpl implements IDao{
    @Override
    public Double getData() {
        System.out.println("Version base de données");
        double temp = 23;
        return temp;
    }
}
