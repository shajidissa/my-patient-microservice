package hello;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Long> {

	//public Patient findById(int id);
	
	public List<Patient> findById(int id);
	
	@Query("from Patient p where p.name like %:name%")
	public List<Patient> findByName(String name);
	
	@Query("from Patient p where p.nhsid like %:nhsid%")
	public List<Patient> findByNhsid(String nhsid);
}
