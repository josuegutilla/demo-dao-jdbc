package model.dao;

import model.impl.SellerDaoJDBC;

public class DaoFactory {

    // retorna os tipo da interface, mas dentro do metodo usa a implementacao que herda da interface.
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
}
