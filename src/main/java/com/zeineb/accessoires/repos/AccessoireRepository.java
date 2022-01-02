package com.zeineb.accessoires.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.zeineb.accessoires.entities.Accessoire;
import com.zeineb.accessoires.entities.TypeAcc;

@RepositoryRestResource(path = "rest")
public interface AccessoireRepository extends JpaRepository<Accessoire, Long> {
	
	List<Accessoire> findByReference(String reference);
	Accessoire findFirstByReference(String reference);
	List<Accessoire> findByReferenceContains(String reference);
	
	//@Query("select a from Accessoire a where a.label like %?7 and a.prix > ?2")
	//List<Accessoire> findByLabelPrix (String label, Double prix);
	
	@Query("select a from Accessoire a where a.label like %:label and a.prix > :prix")
	List<Accessoire> findByLabelPrix(@Param("label") String label, @Param("prix") Double prix);
	
	@Query("select a from Accessoire a where a.typeacc = ?1")
	List<Accessoire> findByTypeAcc(TypeAcc typeacc);
	
	List<Accessoire> findByTypeaccIdT(Long id);
	
	List<Accessoire> findByOrderByLabelAsc();
	
	@Query("select a from Accessoire a order by a.label ASC, a.prix DESC")
	List<Accessoire> trierAccessoiresLabelsPrix();



}
