package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
import model.impl.SellerDaoJDBC;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Celulares");
        Seller seller = new Seller(2, "Josué", "gutillaj@gmail.com", new Date(), 3000, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(obj);
        System.out.println(seller);
    }
}