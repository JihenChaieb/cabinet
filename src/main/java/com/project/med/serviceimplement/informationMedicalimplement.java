package com.project.med.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.med.Entity.Acte;
import com.project.med.Entity.InformationMedical;
import com.project.med.Repository.ActeRepository;
import com.project.med.Repository.InformationMedicalRepository;
import com.project.med.serviceinterface.informationMedicalinterface;

@Service
public class informationMedicalimplement  implements informationMedicalinterface{
	
	
	@Autowired
    private InformationMedicalRepository infoRepos;
	
	@Override
	public InformationMedical saveinfo(InformationMedical info) {
		
		return infoRepos.save(info) ;
	}

	@Override
	public InformationMedical updateinfo(InformationMedical info) {

		return infoRepos.save(info);
	}

	@Override
	public List<InformationMedical> findallinfo() {
	
		return(List<InformationMedical>) infoRepos.findAll();
	}

	@Override
	public void deleteinfo(Long id) {
		
		infoRepos.deleteById(id);
	}
	

}
