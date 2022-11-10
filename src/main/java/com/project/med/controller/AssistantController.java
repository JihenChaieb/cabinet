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
import com.project.med.Entity.Assistant;
import com.project.med.serviceimplement.assistantimplement;


@RestController
@CrossOrigin("*")
public class AssistantController {

	@Autowired
	private assistantimplement assistantinimpl;
	@RequestMapping(value = "/saveassistant",method=RequestMethod.POST, consumes="application/json")
	public Assistant savemed(@RequestBody Assistant assistant) {
		System.out.println("assistant save works properly!");
		assistantinimpl.saveassistant(assistant);
		return assistant;
		
	}
	@GetMapping(value = "/getallassistant")
    public List<Assistant> findAllassistant(){
		return assistantinimpl.findallassistant();
	}
    
	@PutMapping("/updateassistant")
	public Assistant updatemedcin(@RequestBody Assistant assistant) {
		return assistantinimpl.updateassistant(assistant);
	}
	@DeleteMapping("/deleteassistant")
	public 	String deletemedcin(@RequestParam Long id) {
		assistantinimpl.deletassistant(id);
		return "assistant deleted!";
	}
	
}
