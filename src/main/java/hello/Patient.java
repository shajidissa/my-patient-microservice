package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;


@Entity // This tells Hibernate to make a table out of this class
public class Patient {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "name can't empty!")
    @NotNull(message = "name cannot be null")
    @Size(min = 4, max = 30, message = "name must be atleast 4 characters")
    private String name;

    @NotBlank(message = "nhs can't empty!")
    @NotNull(message = "nhs id cannot be null")
    @Size(min = 5, max = 30, message = "nhs id must be atleast 5 characters")
    private String nhsid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNhsid() {
		return nhsid;
	}

	public void setNhsid(String nhsid) {
		this.nhsid = nhsid;
	}
    
    
}

