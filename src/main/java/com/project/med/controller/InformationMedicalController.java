package com.project.med.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.med.Entity.InformationMedical;
import com.project.med.serviceimplement.informationMedicalimplement;

@RestController
@CrossOrigin("*")
public class InformationMedicalController {
	
	@Autowired
	private informationMedicalimplement infoinimpl;
	@RequestMapping(value = "/saveinfo",method=RequestMethod.POST, consumes="application/json")
	public InformationMedical saveinfo(@RequestBody InformationMedical info) {
		System.out.println("info save works properly!");
		infoinimpl.saveinfo(info);
		return info;
		
	}
	@GetMapping(value = "/getallinfo")
    public List<InformationMedical> findAllinfo(){
		return infoinimpl.findallinfo();
	}
    
	@PutMapping("/updateinfo")
	public InformationMedical updateinfo(@RequestBody InformationMedical info) {
		return infoinimpl.updateinfo(info);
	}
	@DeleteMapping("/deleteinfo")
	public 	String deleteinfo(@RequestParam Long id) {
		infoinimpl.deleteinfo(id);
		return "info deleted!";
	}
	
	
	
	
	

}
