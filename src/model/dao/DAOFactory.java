package model.dao;

import db.DB;
import model.dao.implement.DepartmentDaoJDBC;
import model.dao.implement.SellerDaoJDBC;

public class DAOFactory {
	
	public static ISellerDAO createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static IDepartmentDAO createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
