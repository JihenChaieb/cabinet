package com.project.med.Repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.med.Entity.Acte;
@Repository
@EnableJpaRepositories("com.project.med.Repository")

public interface ActeRepository extends CrudRepository<Acte, Long>{

}
