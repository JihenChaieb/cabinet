package com.project.med.Entity;

import javax.persistence.DiscriminatorValue;
//import java.util.*;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("assistant")
public class Assistant extends User {
	
	
	//@OneToMany(mappedBy="assistant")
	//private List<FichePatient> fichePatient;

}
