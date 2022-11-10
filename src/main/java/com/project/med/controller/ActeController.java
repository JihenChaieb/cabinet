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
import com.project.med.Entity.Acte;
import com.project.med.serviceimplement.acteimplement;


@RestController
@CrossOrigin("*")

public class ActeController {
@Autowired
	private acteimplement acteinimpl;
	@RequestMapping(value = "/saveacte",method=RequestMethod.POST, consumes="application/json")
	public Acte saveact(@RequestBody Acte acte) {
		System.out.println("acte save works properly!");
		acteinimpl.saveacte(acte);
		return acte;
		
	}
	@GetMapping(value = "/getallacte")
    public List<Acte> findAllacte(){
		return acteinimpl.findallacte();
	}
    
	@PutMapping("/updateacte")
	public Acte updateacte(@RequestBody Acte acte) {
		return acteinimpl.updateacte(acte);
	}
	@DeleteMapping("/deleteacte")
	public 	String deleteacte(@RequestParam Long id) {
		acteinimpl.deleteActe(id);
		return "acte deleted!";
	}
	

}
