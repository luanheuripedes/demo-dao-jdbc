package application;

import model.dao.DAOFactory;
import model.dao.ISellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		ISellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

	}

}
