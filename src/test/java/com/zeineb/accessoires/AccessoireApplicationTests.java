package com.zeineb.accessoires;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zeineb.accessoires.entities.Accessoire;
import com.zeineb.accessoires.entities.TypeAcc;
import com.zeineb.accessoires.repos.AccessoireRepository;

@SpringBootTest

class AccessoireApplicationTests {

	@Autowired
	private AccessoireRepository accessoireRepository;

	@Test
	public void testCreateAccessoire() {
		Accessoire acc = new Accessoire("REF028", "Bracelet2", 40.5);
		accessoireRepository.save(acc);

	}

	@Test
	public void testFindAccessoire() {
		Accessoire a = accessoireRepository.findFirstByReference("REF028");

		System.out.println(a);
	}

	@Test
	public void testUpdateAccessoire() {
	
		Accessoire a = accessoireRepository.findFirstByReference("REF028");
		a.setPrix(11.0);
		accessoireRepository.save(a);
	}


	@Test
	public void testListerTousProduits() {
		List<Accessoire> accs = accessoireRepository.findAll();
		for (Accessoire a : accs) {
			System.out.println(a);
		}

	}

	@Test
	public void findByReferenceAccessoire() {
		List<Accessoire> accs = accessoireRepository.findByReference("REF011");
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void findByReferenceAccessoireContains() {
		List<Accessoire> accs = accessoireRepository.findByReferenceContains("REF011");
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testfindByLabelPrix() {
		List<Accessoire> accs = accessoireRepository.findByLabelPrix("Bracelet1", 11.0);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testfindByTypeAcc() {
		TypeAcc typ = new TypeAcc();
		typ.setIdT(1L);
		List<Accessoire> accs = accessoireRepository.findByTypeAcc(typ);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void findByTypeAccIdType() {
		List<Accessoire> accs = accessoireRepository.findByTypeaccIdT(1L);
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void findByOrderByLabelAccessoireAsc() {
		List<Accessoire> accs = accessoireRepository.findByOrderByLabelAsc();
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}

	@Test
	public void testTrierAccessoiresLabelsPrix() {
		List<Accessoire> accs = accessoireRepository.trierAccessoiresLabelsPrix();
		for (Accessoire a : accs) {
			System.out.println(a);
		}
	}
	

	@Test
	public void testDeleteAccessoire() {
	Accessoire accessoire =	accessoireRepository.findFirstByReference("REF028");
		accessoireRepository.deleteById(accessoire.getIdAccessoire());

	}

}