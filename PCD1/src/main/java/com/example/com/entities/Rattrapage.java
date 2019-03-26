package com.example.com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.type.SerializableType;

@Entity
public class Rattrapage  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_rattrapage;
	
	@JoinColumn(name="id")
	@ManyToOne(optional=false)
	private Enseignant enseignant ;
	
	
	private Date dateDebut;

	private Date dateFin;

	@OneToOne
	@JoinColumn(name="id_rattrapage")
	private Salle salle ;
	
	
}

