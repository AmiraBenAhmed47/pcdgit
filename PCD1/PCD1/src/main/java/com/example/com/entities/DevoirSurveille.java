package com.example.com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class DevoirSurveille {

	@Id
	private long ds_id ;
	
	
	@JoinColumn(name="id")
	@ManyToOne(optional=false)
	private Enseignant enseignant ;
	
	@OneToOne
	@JoinColumn(name="salle_id")
	private Salle sa;
	
	
}
