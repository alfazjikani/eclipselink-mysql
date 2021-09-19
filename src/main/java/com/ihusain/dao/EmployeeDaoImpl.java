package com.ihusain.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ihusain.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	EntityManager em;

	@Override
	public Employee findEmployee(Employee emp) {
		Employee emp2 = null;
		try {
			
			emp2 = getManager().find(Employee.class, emp.getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return emp2;
	}

	@Override
	public void saveEmployee(Employee emp) {
		try {
			getManager().getTransaction().begin();
			getManager().persist(emp);
			getManager().getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		try {
			getManager().getTransaction().begin();
			Employee m = (Employee)getManager().merge(emp);
			getManager().persist(m);
			getManager().getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void removeEmployee(Employee emp) {
		try {
			getManager().getTransaction().begin();
			Employee e = findEmployee(emp);
			getManager().remove(e);
			getManager().getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private EntityManager getManager() {
		if (em == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("el-demo");
	        em = emf.createEntityManager();
		}
		return em;
	}

}
