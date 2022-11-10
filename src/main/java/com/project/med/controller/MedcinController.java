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

import com.project.med.Entity.Medcin;
import com.project.med.serviceimplement.medcinimplement;

@RestController
@CrossOrigin("*")
public class MedcinController {
	@Autowired
	private medcinimplement medcinimpl;
	@RequestMapping(value = "/savemedcin",method=RequestMethod.POST, consumes="application/json")
	public Medcin savemed(@RequestBody Medcin medcin) {
		System.out.println("medcin save works properly!");
		medcinimpl.savemedcin(medcin);
		return medcin;
		
	}
	@GetMapping(value = "/getallmedcin")
    public List<Medcin> findAllmedcins(){
		return medcinimpl.findallmedcin();
	}
    
	@PutMapping("/updatemedcin")
	public Medcin updatemedcin(@RequestBody Medcin medcin) {
		return medcinimpl.updatemedcin(medcin);
	}
	@DeleteMapping("/deletemedcin")
	public 	String deletemedcin(@RequestParam Long id) {
		
		medcinimpl.deletmedcin(id);
		return "medcin deleted!";
	}
	
	
}
