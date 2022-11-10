package com.project.med.serviceinterface;

import java.util.List;

import com.project.med.Entity.InformationMedical;

public interface informationMedicalinterface {
	
	
	//save new assistant
			public InformationMedical saveinfo(InformationMedical info);
			
			//update assistant
			public InformationMedical updateinfo(InformationMedical info);
			
			//fetch all assistant from data base
			public List<InformationMedical> findallinfo();
			
			//delete assistant 
			public void deleteinfo(Long id);
			
		

}
