package com.project.med.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.med.Entity.Medcin;
import com.project.med.Repository.medRepository;
import com.project.med.serviceinterface.medcininterface;

@Service
public class medcinimplement implements medcininterface {
    @Autowired
    private medRepository medcinrepository;
	@Override
	public Medcin savemedcin(Medcin medcin) {
		// TODO Auto-generated method stub
		return medcinrepository.save(medcin);
	}

	@Override
	public Medcin updatemedcin(Medcin medcin) {
		// TODO Auto-generated method stub
		return medcinrepository.save(medcin);
	}

	@Override
	public List<Medcin> findallmedcin() {
		// TODO Auto-generated method stub
		return (List<Medcin>) medcinrepository.findAll();
	}

	@Override
	public void deletmedcin(Long id) {
		// TODO Auto-generated method stub
		medcinrepository.deleteById(id);
	}

}
