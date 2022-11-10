package com.project.med.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.med.Entity.Acte;
import com.project.med.Repository.ActeRepository;
import com.project.med.serviceinterface.acteinterface;
@Service
public class acteimplement implements acteinterface {
	@Autowired
    private ActeRepository acteRepos;
	
	@Override
	public Acte saveacte(Acte acte) {
		
		return acteRepos.save(acte) ;
	}

	@Override
	public Acte updateacte(Acte acte) {

		return acteRepos.save(acte);
	}

	@Override
	public List<Acte> findallacte() {
	
		return(List<Acte>) acteRepos.findAll();
	}

	@Override
	public void deleteActe(Long id) {
		
		acteRepos.deleteById(id);
	}

	
	

}
