package net.kelompok3.springboot.crudrestfulwebservice.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.kelompok3.springboot.crudrestfulwebservice.exception.ResourceNotFoundException;
import net.kelompok3.springboot.crudrestfulwebservice.model.kelompok3;
import net.kelompok3.springboot.crudrestfulwebservice.repository.Kelompok3Repository;

@RestController
@RequestMapping("/api/v1")
public class Kelompok3Controller {
	
	@Autowired
	private Kelompok3Repository kelompok3Repsitory;
	
	// create get all kelompok3 api
	@GetMapping("/kelompok3")
	public List<kelompok3> getAllkelompok3(){
		return kelompok3Repsitory.findAll();
	}
	
	// create kelompok3
	@PostMapping("/kelompok3")
	public kelompok3 createKelompok3(@RequestBody kelompok3 kelompok3) {
		return kelompok3Repsitory.save(kelompok3);
	}
	
	@PutMapping("/kelompok3/{id}")
	public ResponseEntity<kelompok3> updateKelompok3(@PathVariable(value = "id") Long kelompok3Id,
			@RequestBody kelompok3 kelompok3Details) throws ResourceNotFoundException {
		kelompok3 kelompok3 = kelompok3Repsitory.findById(kelompok3Id)
				.orElseThrow(() -> new ResourceNotFoundException("Kelompok3 not found for this id :: " + kelompok3Id));

		kelompok3.setEmailId(kelompok3Details.getEmailId());
		kelompok3.setLastName(kelompok3Details.getLastName());
		kelompok3.setFirstName(kelompok3Details.getFirstName());
		final kelompok3 updatedKelompok3 = kelompok3Repsitory.save(kelompok3);
		return ResponseEntity.ok(updatedKelompok3);
	}
	
	@DeleteMapping("/kelompok3/{id}")
	public Map<String, Boolean> deleteKelompok3(@PathVariable(value = "id") Long kelompok3Id)
			throws ResourceNotFoundException {
		kelompok3 kelompok3 = kelompok3Repsitory.findById(kelompok3Id)
				.orElseThrow(() -> new ResourceNotFoundException("Kelompok3 not found for this id :: " + kelompok3Id));

		kelompok3Repsitory.delete(kelompok3);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
}
