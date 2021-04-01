package model.dao;

import model.dao.implement.SellerDaoJDBC;

public class DAOFactory {
	
	public static ISellerDAO createSellerDao() {
		return new SellerDaoJDBC();
	}
}
