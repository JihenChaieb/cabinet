package com.project.med.serviceinterface;

import java.util.List;

import com.project.med.Entity.Medcin;



public interface medcininterface {
	

	//save new medcin
	public Medcin savemedcin(Medcin medcin);
	
	//update medcin
	public Medcin updatemedcin(Medcin medcin);
	
	//fetch all medcin from data base
	public List<Medcin> findallmedcin();
	
	//delete medcin
	public void deletmedcin(Long id);
	



}
