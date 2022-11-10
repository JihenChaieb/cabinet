package com.project.med.Entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
@Entity
public class FichePatient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_fich;
	private String etablissement;
	private String remarqueF;
	private String medicament;
	public FichePatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Date dateCreation;
	
	
	
	//@ManyToOne
	//private FichePatient fichePatient;
	public long getId_fich() {
		return id_fich;
	}
	public void setId_fich(long id_fich) {
		this.id_fich = id_fich;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public String getRemarqueF() {
		return remarqueF;
	}
	public void setRemarqueF(String remarqueF) {
		this.remarqueF = remarqueF;
	}
	public String getMedicament() {
		return medicament;
	}
	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public FichePatient(long id_fich, String etablissement, String remarqueF, String medicament, Date dateCreation) {
		super();
		this.id_fich = id_fich;
		this.etablissement = etablissement;
		this.remarqueF = remarqueF;
		this.medicament = medicament;
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "FichePatient [id_fich=" + id_fich + ", etablissement=" + etablissement + ", remarqueF=" + remarqueF
				+ ", medicament=" + medicament + ", dateCreation=" + dateCreation + ", getId_fich()=" + getId_fich()
				+ ", getEtablissement()=" + getEtablissement() + ", getRemarqueF()=" + getRemarqueF()
				+ ", getMedicament()=" + getMedicament() + ", getDateCreation()=" + getDateCreation() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
