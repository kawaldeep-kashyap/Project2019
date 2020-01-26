package com.lbs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lbs.entity.FoodType;
import com.lbs.entity.Login;
import com.lbs.entity.Register;
import com.lbs.entity.Status;
import com.lbs.repository.RegisterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegisterController {

	@Autowired
	private RegisterRepository registerRepository;
	
	
	//@PostMapping("/register")
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public Status register(@RequestBody Register reg) {
	
		//System.out.println(reg.toString());
		
		registerRepository.save(reg);
		
		Status status = new Status();
		status.setStatusCode(100);
		status.setStatusMessage("Registration Successfull!!!");
		return status;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Status register(@RequestBody Login login) {
		
		long count = registerRepository.isValidUser(login.getUsername(), login.getPassword());
		if(count == 0) {
			Status status = new Status();
			status.setStatusCode(101);
			status.setStatusMessage("Invalid User!!");
			return status;
		}
		else {
			Register register = registerRepository.fetch(login.getUsername());
			
			Status status = new Status();
			status.setStatusCode(103);
			status.setStatusMessage("Login Successfull!!");
			status.setLoggedInCustomer(register);
			return status;
		}
	}
	@RequestMapping(value="/createMenu",method=RequestMethod.GET)
	public List<Object> create()
	{
		System.out.println(registerRepository.show());
		return registerRepository.show();
	}
}
