package com.project.med.Entity;

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
public class InformationMedical {

	public InformationMedical() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id_inf;
	private float longueur;
	public long getId_inf() {
		return id_inf;
	}
	

	//@ManyToMany
	//@JoinTable(name="ACT_INFO",
	//		joinColumns= @JoinColumn (name="id_inf"),
		//	inverseJoinColumns = @JoinColumn(name="id_acte"))
	//private List<Acte> actes=new ArrayList<>();
	
	
	
	
	
	
	public InformationMedical(long id_inf, float longueur, float largeur, String tabac, String remarque,
			String alccol) {
		super();
		this.id_inf = id_inf;
		this.longueur = longueur;
		this.largeur = largeur;
		this.tabac = tabac;
		this.remarque = remarque;
		this.alccol = alccol;
	}
	public void setId_inf(long id_inf) {
		this.id_inf = id_inf;
	}
	public float getLongueur() {
		return longueur;
	}
	public void setLongueur(float longueur) {
		this.longueur = longueur;
	}
	public float getLargeur() {
		return largeur;
	}
	public void setLargeur(float largeur) {
		this.largeur = largeur;
	}
	public String getTabac() {
		return tabac;
	}
	public void setTabac(String tabac) {
		this.tabac = tabac;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public String getAlccol() {
		return alccol;
	}
	public void setAlccol(String alccol) {
		this.alccol = alccol;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private float largeur;
	private String tabac;
	private String remarque;
	private String alccol;
	@Override
	public String toString() {
		return "informationMedical [id_inf=" + id_inf + ", longueur=" + longueur + ", largeur=" + largeur + ", tabac="
				+ tabac + ", remarque=" + remarque + ", alccol=" + alccol + ", getId_inf()=" + getId_inf()
				+ ", getLongueur()=" + getLongueur() + ", getLargeur()=" + getLargeur() + ", getTabac()=" + getTabac()
				+ ", getRemarque()=" + getRemarque() + ", getAlccol()=" + getAlccol() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
