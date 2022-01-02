package com.zeineb.accessoires.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeineb.accessoires.entities.Accessoire;
import com.zeineb.accessoires.repos.AccessoireRepository;


@Service
public class AccessoireServiceImpl implements AccessoireService {

	@Autowired
	AccessoireRepository accessoireRepository;

	@Override
	public Accessoire saveAccessoire(Accessoire a) {
		return accessoireRepository.save(a);
	}

	@Override
	public Accessoire updateAccessoire(Accessoire a) {
		return accessoireRepository.save(a);
	}

	@Override
	public void deleteAccessoire(Accessoire a) {
		accessoireRepository.delete(a);
	}

	@Override
	public void deleteAccessoireById(Long id) {
		accessoireRepository.deleteById(id);
	}

	@Override
	public Accessoire getAccessoire(Long id) {
		return accessoireRepository.findById(id).get();
	}

	@Override
	public List<Accessoire> getAllAccessoires() {
		return accessoireRepository.findAll();
	}

	@Override
	public List<Accessoire> findByReferenceAccessoire(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accessoire> findByReferenceAccessoireContains(String reference) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accessoire> findByLabelPrix(String label, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Accessoire> findByTypeAccIdType(Long id) {
		return accessoireRepository.findByTypeaccIdT(id);
	}

	

}
