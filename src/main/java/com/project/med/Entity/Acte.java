package com.project.med.Entity;

import javax.persistence.DiscriminatorValue;

//import java.util.ArrayList;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany; 

@Entity
@DiscriminatorValue("Acte")
public class Acte {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String Specialité;
	private String Nom;
	
	//@ManyToMany
	//@JoinTable(name="ACT_MED",
		//	joinColumns= @JoinColumn (name="id_acte"),
		//	inverseJoinColumns = @JoinColumn(name="id"))
	//private List<Medcin> medcins=new ArrayList<>();
	
	//@ManyToMany
	//@JoinTable(name="ACT_INFO",
		//	joinColumns= @JoinColumn (name="id_acte"),
			//inverseJoinColumns = @JoinColumn(name="id_info"))
	//private List<InformationMedical> infos=new ArrayList<>();
	
	 
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		id = id;
	}
	public String getSpecialité() {
		return Specialité;
	}
	public void setSpecialité(String specialité) {
		Specialité = specialité;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Acte(long id, String specialité, String nom) {
		super();
		id = id;
		Specialité = specialité;
		Nom = nom;
	}
	@Override
	public String toString() {
		return "Acte [Id=" + id+ ", Specialité=" + Specialité + ", Nom=" + Nom + ", getId()=" + getId()
				+ ", getSpecialité()=" + getSpecialité() + ", getNom()=" + getNom() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Acte() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
