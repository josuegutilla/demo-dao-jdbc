package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department obj = new Department(1, "Celulares");
        Seller seller = new Seller(2, "Josué", "gutillaj@gmail.com", new Date(), 3000, obj);

        System.out.println(obj);
        System.out.println(seller);
    }
}