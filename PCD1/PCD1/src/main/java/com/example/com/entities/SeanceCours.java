package com.example.com.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SeanceCours {
	
	@Id
	private long seancecours_id ;
	
	private int h_debut;
	private int h_fin;
	
	
	@JoinColumn(name="id")
	@ManyToOne(optional=false)
	private Enseignant enseignant ;
	
	@JoinTable(name="Emploi_Seancedecours",joinColumns= {@JoinColumn(name="seancecours_id")},inverseJoinColumns= {@JoinColumn(referencedColumnName="emploi_id")})
	@ManyToMany
	private Set<Emploi> emplois ;
	
	@JoinColumn(name="matire_id")
	@ManyToOne(optional=false)
	private Matiere matiere;
	
	@OneToOne
	@JoinColumn(name="salle_id")
	private Salle sal;

}
