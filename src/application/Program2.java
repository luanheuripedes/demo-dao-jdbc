package application;

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
		
	}

}
