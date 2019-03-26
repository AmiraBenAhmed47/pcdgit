package com.example.com.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Groupe {
	
	public enum GroupeEnums {
		A, B, C, D, E, F
	}
	
	@Id
	@GeneratedValue
	private long groupe_id;
	
	private GroupeEnums groupe;
	
	
	@JoinColumn(name="niveau_id")
	@ManyToOne(optional=false)
	private Niveau Niv ; 
	
@OneToMany(mappedBy = "groupe_id", cascade = CascadeType.ALL)
  private Set<Etudiant> stds;
	
	
	@ManyToOne
    @JoinColumn
    private Niveau niveau_id;

	
	
	
	
	
	
	
	
	

}
