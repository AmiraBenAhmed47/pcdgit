package com.example.com.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Emploi {
	
	
	@Id
	private long emploi_id;
	
	@OneToOne(mappedBy="emploi")
	private Enseignant enseignant ;
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="emploi")
	private Set<Etudiant> etudiants;
	@ManyToMany
	private Set<SeanceCours> seancesCours;
	

}
