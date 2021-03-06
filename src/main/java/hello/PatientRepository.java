package hello;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PatientRepository extends CrudRepository<Patient, Long> {

	public Patient findPatientById(int id);
	
	public List<Patient> findById(int id);
	
	@Query("from Patient p where p.name like %:name%")
	public List<Patient> findByName(@Param("name") String name);
	
	@Query("from Patient p where p.nhsid like %:nhsid%")
	public List<Patient> findByNhsid(@Param("nhsid") String nhsid);
	
	@Transactional
	@Modifying
	@Query("delete from Patient p where p.id = :id")
	public void deleteById(@Param("id") int id);
}
