package ma.enset.Pres;

import ma.enset.DAO.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PresentationV2 {
    // Par instanciation dynamique
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao = (IDao) cDao.getConstructor().newInstance();
            System.out.println(dao.getData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
