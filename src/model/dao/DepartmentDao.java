package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    public void insert(Department obj);
    public void update(Department obj);
    public void deleteById(int id);
    public Department findById(int id);
    public List<Department> findAll();
}