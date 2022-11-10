package com.project.med.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.med.Entity.FichePatient;

public interface FichePatientRepository extends CrudRepository<FichePatient,Long> {

}
