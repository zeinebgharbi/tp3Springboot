package com.zeineb.accessoires.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
@Entity
public class Accessoire {



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAccessoire;
	private String reference;
	private String label;
	private double prix;
	
	@ManyToOne
	private TypeAcc typeacc;
	
	public Accessoire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accessoire(long idAccessoire, String reference, String label, double prix, TypeAcc typeacc) {
		super();
		this.idAccessoire = idAccessoire;
		this.reference = reference;
		this.label = label;
		this.prix = prix;
		this.typeacc = typeacc;
	}



	public Accessoire(String reference, String label, double prix) {
		super();
		this.reference = reference;
		this.label = label;
		this.prix = prix;
	}
	
	
	
	public long getIdAccessoire() {
		return idAccessoire;
	}
	public void setIdAccessoire(long idAccessoire) {
		this.idAccessoire = idAccessoire;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public TypeAcc getTypeacc() {
		return typeacc;
	}



	public void setTypeacc(TypeAcc typeacc) {
		this.typeacc = typeacc;
	}



	@Override
	public String toString() {
		return "Accessoire [idAccessoire=" + idAccessoire + ", reference=" + reference + ", label=" + label + ", prix="
				+ prix + "]";
	}
	
	
	
	

}
