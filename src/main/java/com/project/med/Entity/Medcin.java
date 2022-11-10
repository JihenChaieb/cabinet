package com.project.med.Entity;

/*import java.util.ArrayList;
import java.util.List;*/

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;*/


@Entity
@DiscriminatorValue("medcin")
public class Medcin  extends User{
	
/*	@ManyToMany
	@JoinTable(name="ACT_MED",
			joinColumns= @JoinColumn (name="id"),
			inverseJoinColumns = @JoinColumn(name="id_acte"))
	private List<Acte> actes=new ArrayList<>();*/
	

}
