package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.ISellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ISellerDAO sellerDao = DAOFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST2 : seller findByDepartaments =====");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST3 : seller findAll =====");
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST4 : seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller);
		
		System.out.println("\n=== TEST5 : seller UPDATE =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST6 : seller DELETE =====");
		System.out.println("Entre com id para deletar");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete Complete");
		
		sc.close();
	}

}
