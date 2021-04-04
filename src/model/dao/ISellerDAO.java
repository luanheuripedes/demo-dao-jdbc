package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface ISellerDAO {
	public void insert(Seller obj);
	public void update(Seller obj);
	public void deleteById(Integer id);
	
	//consulta o int e consulta se existe esse ID e retorna o obj(Seller) correspondente a esse ID
	//se existir esse Id ele retorna, se nao retorna NULL
	public Seller findById(Integer id);
	
	//retorna todos os departamentos
	List<Seller> findAll();
	
	//Retorna funcionarios por departamento
	List<Seller> findByDepartment(Department dep);
}
