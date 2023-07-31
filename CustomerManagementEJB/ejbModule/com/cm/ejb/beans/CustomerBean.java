package com.cm.ejb.beans;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cm.ejb.interfaces.CustomerDAO;
import com.cm.persistence.entities.Customer;

@Stateless
@Remote(CustomerDAO.class)
public class CustomerBean implements CustomerDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Customer create(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
