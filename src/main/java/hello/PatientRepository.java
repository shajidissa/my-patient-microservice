package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Long> {

	public Patient findById(int id);
	
	public List<Patient> findByName(String name);
	
	public List<Patient> findByNhsid(String nhsid);
}
