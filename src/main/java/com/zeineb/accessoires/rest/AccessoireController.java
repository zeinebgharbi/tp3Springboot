package com.zeineb.accessoires.rest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeineb.accessoires.entities.Accessoire;
import com.zeineb.accessoires.service.AccessoireService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AccessoireController {

	
	@Autowired
	AccessoireService accessoireService;
	@RequestMapping(path="/Accessoires" ,method = RequestMethod.GET )
	public List<Accessoire> getAllAccessoiries() {
	return accessoireService.getAllAccessoires();
	}
	
	@RequestMapping(value="/Accessoire/{id}",method = RequestMethod.GET)
	public Accessoire getAccessoireById(@PathVariable("id") Long id) {
	return accessoireService.getAccessoire(id);

	}
	@RequestMapping(value="/AddAccessoire", method = RequestMethod.POST)
	public Accessoire createAccessoire(@RequestBody Accessoire accessoire) {
	return accessoireService.saveAccessoire(accessoire);
	}
	
	@RequestMapping(value="/UpdateAccessoire", method = RequestMethod.PUT)
	public Accessoire updateAccessoire(@RequestBody Accessoire accessoire) {
	return accessoireService.updateAccessoire(accessoire);
	}
	
	@RequestMapping(value="deleteAccessoire/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		accessoireService.deleteAccessoireById(id);
	}
	
	@RequestMapping(value="/AccessoireByAccIdType/{id}",method = RequestMethod.GET)
	public List<Accessoire> getAccessoireByType(@PathVariable("id") Long idT) {
	return accessoireService.findByTypeAccIdType(idT);
	}
}
