package com.project.med.serviceinterface;

import java.util.List;

import com.project.med.Entity.Acte;


public interface acteinterface {
	//save new assistant
		public Acte saveacte(Acte acte);
		
		//update assistant
		public Acte updateacte(Acte aCTE);
		
		//fetch all assistant from data base
		public List<Acte> findallacte();
		
		//delete assistant 
		public void deleteActe(Long id);
		
	
}
