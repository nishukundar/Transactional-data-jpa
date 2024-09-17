package com.nischitha.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nischitha.entity.Address;
import com.nischitha.entity.Emp;
import com.nischitha.repository.AddressRepository;
import com.nischitha.repository.EmpRepository;


@Service
public class EmployeeService {

	private EmpRepository empRepository;
	private AddressRepository addressRepository;
	
	
	public EmployeeService(EmpRepository empRepository, AddressRepository addressRepository) {
		this.empRepository=empRepository;
	    this.addressRepository=addressRepository;
	}
	
	@Transactional(rollbackFor=Exception.class)
	public void saveData() {
		
		Emp emp = new Emp();
		emp.setEname("Tomy");
		emp.setEsal(734156.53);
		
		Emp savedEntity = empRepository.save(emp);
		
		//Arithmetic exception
		
		int i=10/0;
		System.out.println(i);
				
		Address address = new Address();
		address.setCity("Bangalore");
		address.setCountry("India");
		address.setState("Karnataka");
		address.setType("Permanent");
		address.setAddrId(savedEntity.getEid());
			
		addressRepository.save(address);
		
		
	}
}
