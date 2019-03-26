package com.example.com.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Enseignant extends User{
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="enseignant")
	private Set<Rattrapage> rattrapages;
	
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="enseignant")
	private Set<Rattrapage> ds;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="enseignant")
	private Set<Rattrapage> absence;
	
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="enseignant")
	private Set<Rattrapage> seancecours;
	
	@OneToOne
	@JoinColumn(name="emploi_id")
	private Emploi emploi ;
	
   
	
}
