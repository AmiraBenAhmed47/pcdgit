package com.example.com.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Matiere {
	
	@Id
	private long matiere_id;
	
	@JoinColumn(name="id")
	@ManyToOne(optional=false)
	private Filiere niveau;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="matiere")
	private Set<SeanceCours> seancour;
	

}
