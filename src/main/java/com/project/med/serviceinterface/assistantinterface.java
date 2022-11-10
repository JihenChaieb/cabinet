package com.project.med.serviceinterface;

import java.util.List;

import com.project.med.Entity.Assistant;


public interface assistantinterface {


	//save new assistant
	public Assistant saveassistant(Assistant assistant);
	
	//update assistant
	public Assistant updateassistant(Assistant assistant);
	
	//fetch all assistant from data base
	public List<Assistant> findallassistant();
	
	//delete assistant 
	public void deletassistant(Long id);
	
}
