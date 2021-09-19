package com.ihusain;

import java.util.ArrayList;
import java.util.List;

import com.ihusain.dao.EmployeeDao;
import com.ihusain.dao.EmployeeDaoImpl;
import com.ihusain.model.Account;
import com.ihusain.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDao empDao = new EmployeeDaoImpl();

    	//empDao.findEmployee(new Employee(32));

    	Account a = new Account();
    	a.setAccountNumber("123456780370");
    	a.setType(1);
    	Account b = new Account();
    	b.setAccountNumber("123456781371");
    	b.setType(2);
    	List<Account> l = new ArrayList<>();
    	l.add(a);
    	l.add(b);
    	
    	Employee e = new Employee();
    	e.setName("John377");
    	e.setSalary(38000);
    	e.setAccounts(l);
    	
    	//empDao.saveEmployee(e);
        // empDao.updateEmployee(e);
    	
    	e = new Employee();
    	e.setId(32);
    	//empDao.removeEmployee(e);
    }
}
