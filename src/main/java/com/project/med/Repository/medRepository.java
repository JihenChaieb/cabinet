package com.project.med.Repository;

import org.springframework.data.repository.CrudRepository;

import com.project.med.Entity.Medcin;

public interface medRepository extends CrudRepository<Medcin, Long> {

}
