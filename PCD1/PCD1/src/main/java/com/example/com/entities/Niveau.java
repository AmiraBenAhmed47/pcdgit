package com.example.com.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Niveau {

	public enum NiveauEnums {
		II_1, II_2, II_3

	}

	@Id
	@GeneratedValue
	private long niveau_id;

	private NiveauEnums niveau;

	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="Niv")
	private Set<Groupe> groupes;
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="niveaux")
	private Set<Filiere> filieres ;
	

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="niveau")
  private Set<Etudiant> etudiants;

@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="niveau")
private Set<Matiere> matieres;


	

	
	

}
