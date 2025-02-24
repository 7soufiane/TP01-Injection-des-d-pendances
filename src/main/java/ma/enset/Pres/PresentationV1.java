package ma.enset.Pres;

import ma.enset.DAO.DaoImpl;
import ma.enset.DAO.IDao;
import ma.enset.Meties.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        // Instanciation et injection des dépendances
        IDao dao = new DaoImpl(); // ou new DaoImplV2()
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Test
        System.out.println("Résultat : " + metier.calcul());

    }
}
