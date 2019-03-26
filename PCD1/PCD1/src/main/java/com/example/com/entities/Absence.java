package com.example.com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Absence {
	
	@Id
	private long absence_id;
	
	@JoinColumn(name="id")
	@ManyToOne(optional=false)
	private Enseignant enseignant ;

}
