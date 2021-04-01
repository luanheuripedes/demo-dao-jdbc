package model.dao;

import java.util.List;

import model.entities.Department;

public interface IDepartmentDAO {
	public void insert(Department obj);
	public void update(Department obj);
	public void deleteById(Integer id);
	
	//consulta o int e consulta se existe esse ID e retorna o obj(Department) correspondente a esse ID
	//se existir esse Id ele retorna, se nao retorna NULL
	public Department findById(Integer id);
	
	//retorna todos os departamentos
	List<Department> findAll();
}
