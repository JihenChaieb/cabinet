package com.project.med.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.med.Entity.FichePatient;
import com.project.med.Repository.FichePatientRepository;
import com.project.med.serviceinterface.fichePatientinterface;

@Service
public class fichePatientimplement implements fichePatientinterface {
	
	@Autowired
    private FichePatientRepository ficheRepos;
	@Override
	
	public  FichePatient savefiche(FichePatient fiche) {
		
		return ficheRepos.save(fiche) ;
	}

	@Override
	public FichePatient updatefiche(FichePatient fiche) {

		return ficheRepos.save(fiche);
	}

	@Override
	public List<FichePatient> findallfiche() {
	
		return(List<FichePatient>) ficheRepos.findAll();
	}

	@Override
	public void deletefiche(Long id) {
		
		ficheRepos.deleteById(id);
	}

	

}
