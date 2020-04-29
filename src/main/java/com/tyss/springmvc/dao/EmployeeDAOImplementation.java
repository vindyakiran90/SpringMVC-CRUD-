package com.tyss.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.springmvc.beans.Employee;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public List<Employee> getAllEmployeeInfo() {
		EntityManager manager = factory.createEntityManager();
		String jpql = "select e from Employee e";
		TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
		List<Employee> info = query.getResultList();
		manager.close();
		return info;
	}

	@Override
	public Employee getEmployeeDetail(int id) {
		EntityManager manager = factory.createEntityManager();
		Employee info = manager.find(Employee.class, id);
		manager.close();
		return info;
	}

	@Override
	public boolean createEmployeeInfo(Employee info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean updateEmployeeInfo(Employee info, int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			String jpql = "update Employee e set e.password= :password where e.id = :id";
			Query query = manager.createQuery(jpql);
			query.setParameter("password", info.getPassword());
			query.setParameter("id", id);
			query.executeUpdate();
			transaction.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			manager.close();
		}
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		EntityManager manager = factory.createEntityManager();
		Employee employeeInfoBean = manager.find(Employee.class, id);

		if(employeeInfoBean != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			manager.close();
			return true;
		}
		return false;
	}
}
