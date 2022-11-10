package com.project.med.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.med.Entity.Assistant;
import com.project.med.Repository.AssistantRepository;
import com.project.med.serviceinterface.assistantinterface;

@Service
public class assistantimplement implements assistantinterface {
	
	@Autowired
     private AssistantRepository assistantRepos;
	
	@Override
	public Assistant saveassistant(Assistant assistant) {
		
		return assistantRepos.save(assistant) ;
	}

	@Override
	public Assistant updateassistant(Assistant assistant) {

		return assistantRepos.save(assistant);
	}

	@Override
	public List<Assistant> findallassistant() {
	
		return(List<Assistant>) assistantRepos.findAll();
	}

	@Override
	public void deletassistant(Long id) {
		
		assistantRepos.deleteById(id);
	}

}
