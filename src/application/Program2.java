package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DAOFactory;
import model.dao.IDepartmentDAO;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		IDepartmentDAO departmentDao = DAOFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST4 : seller insert =====");
		Department newDepartment = new Department(null, "Comissoes");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		System.out.println("\n===== Teste 2: department UPDATE ======");
		Department updateDepartment = new Department(1,"Computers Red");
		departmentDao.update(updateDepartment);
		System.out.println(updateDepartment);
		
		System.out.println("\n===== Teste 2: department Find By id ======");
		Department findBYDEPARTMENT = new Department();
		findBYDEPARTMENT = departmentDao.findById(56);
//		
		if(findBYDEPARTMENT == null) {
			System.out.println("Não existe departamento");
		}else
		System.out.println(findBYDEPARTMENT);
		
		System.out.println("\n===== Teste 3: department Find ALL ======");
		List<Department> findAll = new ArrayList<Department>();
		findAll = departmentDao.findAll();
		
		if(findAll == null) {
			System.out.println("Não existe departamento");
		}else {
			System.out.println(findAll);
		}
		
	}

}
