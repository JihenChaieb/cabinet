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

import com.project.med.Entity.FichePatient;
import com.project.med.serviceimplement.fichePatientimplement;

@RestController
@CrossOrigin("*")
public class FichePatientController {
	
	@Autowired
	private fichePatientimplement ficheinimpl;
	@RequestMapping(value = "/savefiche",method=RequestMethod.POST, consumes="application/json")
	public FichePatient savefich(@RequestBody FichePatient fiche) {
		System.out.println("fiche save works properly!");
		ficheinimpl.savefiche(fiche);
		return fiche;
		
	}
	@GetMapping(value = "/getallfiche")
    public List<FichePatient> findAllfiche(){
		return ficheinimpl.findallfiche();
	}
    
	@PutMapping("/updatefich")
	public FichePatient updatefiche(@RequestBody FichePatient fiche) {
		return ficheinimpl.updatefiche(fiche);
	}
	@DeleteMapping("/deletefiche")
	public 	String deletefich(@RequestParam Long id) {
		ficheinimpl.deletefiche(id);
		return "fiche deleted!";
	}
	
	
	
	

}
