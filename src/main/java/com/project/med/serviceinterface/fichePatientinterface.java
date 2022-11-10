package com.project.med.serviceinterface;

import java.util.List;

import com.project.med.Entity.FichePatient;

public interface fichePatientinterface {

	
	
	//save new assistant
		public FichePatient savefiche(FichePatient fiche);
		
		//update assistant
		public FichePatient updatefiche(FichePatient fiche);
		
		//fetch all assistant from data base
		public List<FichePatient> findallfiche();
		
		//delete assistant 
		public void deletefiche(Long id);
		
}
