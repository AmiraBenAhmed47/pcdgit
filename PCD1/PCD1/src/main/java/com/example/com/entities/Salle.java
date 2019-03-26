package com.example.com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Salle {
	
	@Id
	@GeneratedValue
	private  long id_salle;
	
	@OneToOne(mappedBy="salle")
	private Rattrapage rattrapage ;
	
	
	
	@OneToOne(mappedBy="sal")
	private SeanceCours sCours;
	
	//cause une erreur
	@OneToOne(mappedBy="sa")
	private DevoirSurveille dSurveille;
}
