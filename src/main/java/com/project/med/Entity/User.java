package com.project.med.Entity;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type")
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private String firstname;
	private String lastname;
	private String Email;
	private String Password;
	private String Phone;
	private String Adresse;
	private String gender;
	private Date birthday;
	private Integer roll;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long id, String firstname, String lastname, String email, String password, String phone, String adresse,
			String gender, Date birthday, Integer roll) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		Email = email;
		Password = password;
		Phone = phone;
		Adresse = adresse;
		this.gender = gender;
		this.birthday = birthday;
		this.roll = roll;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Email=" + Email
				+ ", Password=" + Password + ", Phone=" + Phone + ", Adresse=" + Adresse + ", gender=" + gender
				+ ", birthday=" + birthday + ", roll=" + roll + "]";
	}
	
	 
	
	
	

}
