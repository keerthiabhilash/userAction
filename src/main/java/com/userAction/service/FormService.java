package com.userAction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userAction.Bo.customerBo.CustomerBo;
import com.userAction.Bo.customerBo.RegistrationForm;
import com.userAction.Dao.RegistrationDao;
import com.userAction.service.IService.IFormService;
import com.userAction.util.UserActionConstants;
import com.userAction.util.UserActionConstants.UserStatus;

@Service ("formService")
public class FormService implements IFormService{
	
	@Autowired
	RegistrationDao registrationDao;
	
	
	public String validateAndSave(RegistrationForm newRegistration) {

		CustomerBo custmer = this.createCustomerBo(newRegistration);		
		registrationDao.saveRegistrationForm(custmer);
		return null;
		
		
		
	}
	
	
	
	 CustomerBo createCustomerBo(RegistrationForm newRegistration){
		
		 CustomerBo custmer = new CustomerBo();
		 custmer.setFirstName(newRegistration.getFirstName());
		 custmer.setLastName(newRegistration.getLastName());
		 custmer.setEmail(newRegistration.getEmail());
		 custmer.setPhoneNumber(newRegistration.getPhone());
		 custmer.setActiveStatus(UserStatus.ACTIVE.getStatusCode());
		 
		 if(newRegistration.getCustContact()!=null){
			 custmer.setCostomerContact(newRegistration.getCustContact());
		 }
		 return custmer;
	}
	

}
