package com.example.com.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Filiere {
	public enum FiliereEnums {
		IF, ISID, ILSI, RSR, SLE, II,TRONC_COMMUN

	}
	@Id
	@GeneratedValue
	private long  filiere_id;
	private FiliereEnums  nomFiliere;
	@JoinColumn(name="niveau_id")
	@ManyToOne(optional= false)
	private Niveau niveaux;

	//erreur
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="fil")
	private Set<Etudiant> etuds;
	
	
	
}
