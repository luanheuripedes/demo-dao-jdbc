package model.dao;

import db.DB;
import model.dao.implement.SellerDaoJDBC;

public class DAOFactory {
	
	public static ISellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
