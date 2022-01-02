package com.zeineb.accessoires.repos;

import org.springframework.data.rest.core.config.Projection;

import com.zeineb.accessoires.entities.Accessoire;

@Projection(name = "label", types = { Accessoire.class })
public interface AccessoireProjection {
	
	
	public String getLabel();

}
