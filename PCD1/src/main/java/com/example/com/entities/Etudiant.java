package com.example.com.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant extends User{
@ManyToOne
 @JoinColumn(name="groupe_id")
  private Groupe groupe_id;
@JoinColumn(name="emploi_id")
@ManyToOne(optional=false)
private Emploi emploi;
@JoinColumn(name="niveau_id")
@ManyToOne(optional=false)
private Niveau niveau ;

//erreur
@JoinColumn(name="filiere_id")
@ManyToOne
private Filiere fil;
		


}
