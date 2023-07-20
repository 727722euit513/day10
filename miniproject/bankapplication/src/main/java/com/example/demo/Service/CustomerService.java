package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Customer;
import com.example.demo.Repo.CustomerRepo;
@Service
public class CustomerService {
	@Autowired //extends another class
	CustomerRepo stRepo; //reference variable
	
	public Customer savesign(Customer cr) {
		return stRepo.save(cr);
	}
	public List <Customer>getDetails()

{
		return stRepo.findAll();
		
}
	public Customer UpdateDetails(Customer c1)
	{
		return stRepo.saveAndFlush(c1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}