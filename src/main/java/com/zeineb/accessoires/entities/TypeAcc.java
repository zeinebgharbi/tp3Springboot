package com.zeineb.accessoires.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TypeAcc {
	
	@JsonIgnore
	@OneToMany(mappedBy = "typeacc")
	private List<Accessoire> accessoire;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idT;
	private String nomT;
	private String descriptionT;
	
	
	public TypeAcc(String nomT, String descriptionT) {
		this.nomT = nomT;
		this.descriptionT = descriptionT;
	}


	public Long getIdT() {
		return idT;
	}


	public void setIdT(Long idT) {
		this.idT = idT;
	}


	public String getNomT() {
		return nomT;
	}


	public void setNomT(String nomT) {
		this.nomT = nomT;
	}


	public String getDescriptionT() {
		return descriptionT;
	}


	public void setDescriptionT(String descriptionT) {
		this.descriptionT = descriptionT;
	}


	@Override
	public String toString() {
		return "TypeAcc [idT=" + idT + ", nomT=" + nomT + ", descriptionT=" + descriptionT + "]";
	}
	
	
	
	

}
